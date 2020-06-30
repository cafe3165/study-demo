package com.studydemo.demo.Exception;

import lombok.Data;

/**
 * Author:cafe3165
 * Date:2020-05-24
 */
@Data
public class ErrorResponse {

    private String message;
    private String errorTypeName;

    public ErrorResponse(Exception e) {
        this(e.getClass().getName(), e.getMessage());
    }

    public ErrorResponse(String errorTypeName, String message) {
        this.errorTypeName = errorTypeName;
        this.message = message;
    }

}
