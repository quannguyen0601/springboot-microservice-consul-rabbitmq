package com.citynow.revollet.revollet_auth_service.controller;

import com.citynow.revollet.revollet_auth_service.constant.ResponseMessage;
import com.citynow.revollet.revollet_auth_service.dto.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BaseController {

    @Value("${spring.application.name}")
    private String serviceName;

    @GetMapping(path = "/service")
    ApiResponse getServiceName(){
       return new ApiResponse(HttpStatus.OK, ResponseMessage.SUCCESS.getMessage(), "Hello" + " " + serviceName +" "+ new Date().toString());
    }




}
