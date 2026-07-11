package com.demo.SpringRESTApiCRUD.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping
public class RestApiController {

   
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
