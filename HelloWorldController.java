package com.example.springboot.Controllers;

import com.example.springboot.Services.HelloWorldService;
import com.example.springboot.models.Employee;
import com.example.springboot.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService hws;

    @GetMapping("/hello")
    public List<Employee> hello(){
        return hws.getEmp();
    }

    //post method
    @PostMapping("/hello")
    public String postmethod(){
        return hws.postmethod();
    }

    @PutMapping("/hello")
    public String putmethod(){
        return hws.putmethod();
    }

    @DeleteMapping("/hello")
    public String deletemethod(){
        return hws.deletemethod();
    }
}
