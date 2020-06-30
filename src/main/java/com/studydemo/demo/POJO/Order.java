package com.studydemo.demo.POJO;

import lombok.Data;

import java.util.List;

/**
 * Author:cafe3165
 * Date:2020-04-15
 */
@Data
public class Order {
    private int id;
    private String code;

    List<OrderItem> orderItems;
}
