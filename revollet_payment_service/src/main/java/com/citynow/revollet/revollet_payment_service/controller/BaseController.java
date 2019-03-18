package com.citynow.revollet.revollet_payment_service.controller;

import com.citynow.revollet.revollet_payment_service.dto.ApiResponse;
import com.citynow.revollet.revollet_payment_service.service.UserConsumerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.Date;
import java.util.List;

@RestController
public class BaseController {


    private final UserConsumerService userConsumerService;

    @Value("${spring.application.name}")
    private String serviceName;

    @Autowired
    public BaseController(UserConsumerService userConsumerService) {
        this.userConsumerService = userConsumerService;
    }

    //@Secured({"ROLE_ADMIN"})
    @PreAuthorize("hasAuthority('ADMIN')")
//    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ADMIN')")
    @GetMapping(path = "/service/admin")
    String getServiceName(){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String username = authentication.getName();

        //List<GrantedAuthority> authorityList = authentication.getAuthorities();


        return "Hello Admin" + " " + serviceName +" "+ new Date().toString();
    }

//    @PreAuthorize("hasRole('ROLE_OPERATOR')")
    //@Secured({"ROLE_OPERATOR"})

    @PreAuthorize("hasAuthority('OPERATOR')")
    @GetMapping(path = "/service/operator")
    String getOperatorName(){
        return "Hello Operator" + " " + serviceName +" "+ new Date().toString();
    }


    @GetMapping(path = "/service/users")
    ApiResponse getListUser() {
        try {
            return new ApiResponse(HttpStatus.OK,"success",userConsumerService.getListUser());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return  new ApiResponse(HttpStatus.INTERNAL_SERVER_ERROR,"error",e.getMessage());
        }
    }
}
