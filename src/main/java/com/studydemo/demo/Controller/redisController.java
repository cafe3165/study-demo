package com.studydemo.demo.Controller;

import com.studydemo.demo.util.RedisUtil;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:cafe3165
 * Date:2020-05-01
 */
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@RestController
@RequestMapping("/redis")
public class redisController {
    @GetMapping("test")
    public void test() {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: " + jedis.get("runoobkey"));
    }
    @Resource
    private RedisUtil redisUtil;

    @GetMapping("test2")
    public String test2(){
        redisUtil.set("a","aa");
        return redisUtil.get("a");
    }





}
