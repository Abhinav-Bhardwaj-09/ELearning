package com.authenticationusingSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 01/09/22
 * Time: 23:20
 */

@RestController
public class DashboardController {
    @GetMapping("/")
    public String getMessage() {
        return "<h1> Welcome to the Dashboard</h1><br><br> <a href='logout'>Logout</a>";
    }
}
