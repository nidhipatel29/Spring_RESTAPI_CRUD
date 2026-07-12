package com.demo.SpringRESTApiCRUD.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.SpringRESTApiCRUD.CustomException.StudentNotFoundException;
import com.demo.SpringRESTApiCRUD.Entity.Student;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import com.demo.SpringRESTApiCRUD.ErrorResponce.StudentErrorResponce;



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

        //check again list size
        if((studentId>list.size())|| studentId <0){
           throw new StudentNotFoundException("Student not found" + studentId); 
        }
       
        return list.get(studentId);
    }

  

}
