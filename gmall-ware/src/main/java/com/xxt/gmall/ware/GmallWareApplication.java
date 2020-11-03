package com.xxt.gmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallWareApplication.class, args);
    }

}
