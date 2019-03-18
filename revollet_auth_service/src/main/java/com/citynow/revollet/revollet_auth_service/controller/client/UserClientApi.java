package com.citynow.revollet.revollet_auth_service.controller.client;

import com.citynow.revollet.revollet_auth_service.constant.ResponseMessage;
import com.citynow.revollet.revollet_auth_service.dto.ApiResponse;
import com.citynow.revollet.revollet_auth_service.dto.mapper.UserMapper;
import com.citynow.revollet.revollet_auth_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserClientApi extends BaseClientApi {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    ApiResponse getAllUser() {
        return new ApiResponse(HttpStatus.OK, ResponseMessage.SUCCESS.getMessage(),userService.getAllUser());
    }

}
