package com.demo.SpringRESTApiCRUD.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringRESTApiCRUD.Entity.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class StudentRestController {
    
    @GetMapping("/student")
    public List<Student> getStudent(){
        List<Student> list=new ArrayList<>();
        list.add(new Student("nidhi","patel"));
        list.add(new Student("paranshu","OG"));
        list.add(new Student("hemant","father"));
        list.add(new Student("rashmi","mother"));
        return list;
    } 
    

}
