package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class Controller {

    @GetMapping("/hello")
    public String hello()
    {
            return "Hello!!! Good to see you";
    }
    @GetMapping("/Add")
    public String add()
    {
       return " Addition is one of the arithmetic operations" ;
    }
        
    }
    
    
    



