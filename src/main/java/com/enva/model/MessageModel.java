package com.enva.model;

/**
 * Message model
 */
public class MessageModel {
    private String message;
    private String type;
    private Integer code;

    public String getMessage() {
        return message;
    }

    public MessageModel setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getType() {
        return type;
    }

    public MessageModel setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public MessageModel setCode(Integer code) {
        this.code = code;
        return this;
    }
}
