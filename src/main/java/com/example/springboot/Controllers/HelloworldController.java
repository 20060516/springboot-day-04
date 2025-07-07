package com.example.springboot.Controllers;

import com.example.springboot.Services.HelloWorldService;
import com.example.springboot.models.Employee;
import com.example.springboot.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloworldController {

    @Autowired
    private HelloWorldService hws;

    @GetMapping("/get")
    public List<Student> getMethod() {
        return hws.helloWorld();
    }

    @PostMapping("/post")
    public String postMethod(@RequestBody Student student) {
        return hws.post(student);
    }

    @PutMapping("/put")
    public String putMethod() {
        return hws.put();
    }

    @DeleteMapping("/del")
    public String deleteMethod() {
        return hws.delete();
    }
}