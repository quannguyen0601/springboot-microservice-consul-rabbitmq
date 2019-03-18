package com.citynow.revollet.revollet_auth_service.constant;

public enum  ResponseMessage {
    SUCCESS("success");

    private String message;

    ResponseMessage(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
