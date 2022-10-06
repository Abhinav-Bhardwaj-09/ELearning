package com.deployonaws.deployapplicationoncloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DeployApplicationOnCloudApplication {

    @GetMapping("/")
    public String awsexample() {
        return "This page is a SpringBoot Project deployed by Abhinav Bhardwaj.";
    }

    public static void main(String[] args) {
        SpringApplication.run(DeployApplicationOnCloudApplication.class, args);
    }

}
