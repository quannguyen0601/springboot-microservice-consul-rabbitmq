package com.citynow.revollet.revollet_payment_service.consumer;

import com.citynow.revollet.revollet_payment_service.dto.ApiResponse;
import com.citynow.revollet.revollet_payment_service.dto.UserDto;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@FeignClient(value = "auth-service", fallback = UserClient.UserClientFallBack.class)
public interface UserClient {



    @RequestMapping(value = "/client/users",consumes = "application/json")
    JsonNode getListUser();

    @Slf4j
    class UserClientFallBack implements UserClient {

        @Override
        public JsonNode getListUser() {
            log.error("Get User error, fallback to empty list");
            return null;
        }
    }

}
