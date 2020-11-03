package com.xxt.gmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.xxt.gmall.member.feign")
public class GmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallMemberApplication.class, args);
    }

}
