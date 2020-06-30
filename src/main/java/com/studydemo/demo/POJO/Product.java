package com.studydemo.demo.POJO;

import lombok.Data;

/**
 * Author:cafe3165
 * Date:2020-04-15
 */
@Data
public class Product {
    private int id;
    private String name;
    private float price;
    private Category category;
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
