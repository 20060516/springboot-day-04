package com.example.springboot.Controllers;

import com.example.springboot.Services.StudentService;
import com.example.springboot.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloworldController {

    @Autowired
    private StudentService ss;

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return ss.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        return ss.getStudentById(id);
    }

    @PostMapping("/student/post")
    public String addStudent(@RequestBody Student student) {
        return ss.addStudent(student);
    }

    @PutMapping("/student/put")
    public String updateStudent(@RequestBody Student student) {
        return ss.updateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id) {
        return ss.deleteStudentById(id);
    }
}