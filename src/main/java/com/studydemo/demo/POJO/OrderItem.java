package com.studydemo.demo.POJO;

import lombok.Data;

/**
 * Author:cafe3165
 * Date:2020-04-15
 */
@Data
public class OrderItem {
    private int id;
    private int number;
    private Order order;
    private Product product;


}