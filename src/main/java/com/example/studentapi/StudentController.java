package com.example.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {

   StudentRepository repository=new InMemoryStudentRepository();

    //RestEndpoint
    //Create a student

   @PostMapping("/student")
    public void createStudent(@RequestBody Student student){

       repository.save(student);
   }

   @GetMapping("/student/{id}")
   public Student getStudent(@PathVariable String  id){
       return repository.get(id);

       //delete a student

       //update a student
   }
}
