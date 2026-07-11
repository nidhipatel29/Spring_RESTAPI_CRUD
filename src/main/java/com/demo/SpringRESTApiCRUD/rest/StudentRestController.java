package com.demo.SpringRESTApiCRUD.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringRESTApiCRUD.Entity.Student;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> list;

   @PostConstruct
    public void loadData(){
        list=new ArrayList<>();
        list.add(new Student("nidhi","patel"));
        list.add(new Student("paranshu","OG"));
        list.add(new Student("hemant","father"));
        list.add(new Student("rashmi","mother"));
    }
    
    @GetMapping("/student")
    public List<Student> getStudent(){
       
        return list;
    } 
    
    @GetMapping("student/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
       
        return list.get(studentId);
    }

}
