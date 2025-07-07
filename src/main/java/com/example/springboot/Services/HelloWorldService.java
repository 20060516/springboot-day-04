package com.example.springboot.Services;

import com.example.springboot.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Pranavi", "CSE"),
                    new Student(2, "Pavi", "ECE")
            )
    );

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            return students.get(index);
        } else {
            return new Student(); // empty object if not found
        }
    }

    public String addStudent(Student student) {
        students.add(student);
        return "Student added successfully";
    }

    public String updateStudent(Student student) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (student.getId() == students.get(i).getId()) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            students.set(index, student);
            return "Updated successfully!!!";
        } else {
            return "No such Student is present";
        }
    }

    public String deleteStudentById(int id) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            students.remove(index);
            return "Deleted successfully!!!";
        } else {
            return "No such Student is present";
        }
    }
}



