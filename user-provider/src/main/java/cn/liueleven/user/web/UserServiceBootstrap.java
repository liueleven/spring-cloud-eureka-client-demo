package cn.liueleven.user.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-15 11:10
 * @author: 十一
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceBootstrap.class,args);
    }
}
