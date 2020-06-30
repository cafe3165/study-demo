package com.studydemo.demo.Exception;

/**
 * Author:cafe3165
 * Date:2020-05-24
 */
/**
 * @author shuang.kou
 * 自定义异常类型
 */
public class ResourceNotFoundException extends RuntimeException {
    private String message;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
