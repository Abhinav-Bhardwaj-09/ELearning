package com.deployonaws.deployapplicationoncloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 06/10/22
 * Time: 23:38
 */


@RestController
public class Controller {
    @GetMapping("/")
    public String awsexample() {
        return "This page is a SpringBoot Project deployed by Abhinav Bhardwaj.";
    }
}
