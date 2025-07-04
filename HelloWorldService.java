package com.example.springboot.Services;

import com.example.springboot.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    // Create a list of students
    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "pranavi", "CSE"),
                    new Student(2, "pavi", "ECE")
            )
    );

    public List<Student> helloWorld() {
        return students;
    }

    public String post(Student student) {
        students.add(student);
        return "Student added successfully: " + student.getName();
    }

    public String put() {
        return "This is put method";
    }

    public String delete() {
        return "This is delete method";
    }
}
