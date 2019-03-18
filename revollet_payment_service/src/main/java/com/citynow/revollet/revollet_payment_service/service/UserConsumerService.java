package com.citynow.revollet.revollet_payment_service.service;

import com.citynow.revollet.revollet_payment_service.consumer.UserClient;
import com.citynow.revollet.revollet_payment_service.dto.ApiResponse;
import com.citynow.revollet.revollet_payment_service.dto.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserConsumerService {

    private final UserClient userClient;

    private final ObjectMapper objectMapper;

    @Autowired
    public UserConsumerService(UserClient userClient,ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        this.userClient = userClient;
    }


    public UserDto[] getListUser() throws JsonProcessingException {

        JsonNode result = userClient.getListUser();

        UserDto[] user = objectMapper.treeToValue(result.get("result"),UserDto[].class) ;

        return user;
    }
}
