package com.studydemo.demo.POJO;

import lombok.Data;

import java.util.List;

/**
 * Author:cafe3165
 * Date:2020-04-15
 */
@Data
public class Category {
    private int id;
    private String name;
    List<Product> products;
    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }

}