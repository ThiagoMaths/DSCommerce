package com.devsuperior.dscommerce.dto;

public class FieldMessageDTO {
    private String fieldName;
    private String message;

    public FieldMessageDTO(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldname() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
