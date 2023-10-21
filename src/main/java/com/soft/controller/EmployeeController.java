package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class EmployeeController {
@GetMapping("/cnu")

public String example(Model model) {
    model.addAttribute("message", "Hello, World!");
    System.out.println("Hello index");
    String htmlContent = "<html><body><h1>Hello, World!</h1></body></html>";
    return htmlContent;

}

    @GetMapping("/cnuu")
    public String saveEmployees(){
        System.out.println("Hello sreenuNaik");
        return "hello sreenu";
    }
}
