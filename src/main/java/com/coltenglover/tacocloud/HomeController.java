package com.coltenglover.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //Handles requests at the root of the URL
    public String home() {
        return "home";
    }
}
