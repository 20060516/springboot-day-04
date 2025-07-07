package com.example.springboot.Services;

<<<<<<< HEAD
import com.example.springboot.models.Employee;
=======
import com.example.springboot.models.Student;
>>>>>>> 77bafe60f243fffec7048391f1c2f4f96a20aa42
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

<<<<<<< HEAD
    List<Employee> Emp = new ArrayList<>(
            Arrays.asList(new Employee(1, "Pavi", "Trainer"),
                    new Employee(2, "Pranavi", "Manager"))
    );

    public List<Employee> helloWorld() {
        return Emp;
    }

    public Employee getEmployeeById(int empid) {
        int ind = 0;
        boolean flag = false;
        for (int i = 0; i < Emp.size(); i++) {
            if (empid == Emp.get(i).getEmpid()) {
                System.out.println("Emp_Id: " + Emp.get(i).getEmpid() + Emp.get(i));
                ind = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            return Emp.get(ind);
        } else {
            return new Employee();
        }
    }

    public String get() {
        return "This is get method";
    }

    public String post(Employee emp) {
        Emp.add(emp);
        return "Employee added successfully";
=======
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
>>>>>>> 77bafe60f243fffec7048391f1c2f4f96a20aa42
    }

    public String put() {
        return "This is put method";
    }

    public String delete() {
        return "This is delete method";
    }
<<<<<<< HEAD

    public String deleteEmployeeById(int empid) {
        int ind = 0;
        boolean flag = false;
        for (int i = 0; i < Emp.size(); i++) {
            if (empid == Emp.get(i).getEmpid()) {
                System.out.println("Emp_Id: " + Emp.get(i).getEmpid() + Emp.get(i));
                ind = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            Emp.remove(ind);
            return "Deleted successfully!!!";
        } else {
            return "No such Employee is present";
        }
    }

    public String updateRecord(Employee emp) {
        int ind = 0;
        boolean flag = false;
        for (int i = 0; i < Emp.size(); i++) {
            if (emp.getEmpid() == Emp.get(i).getEmpid()) {
                System.out.println("Emp_Id: " + Emp.get(i).getEmpid() + Emp.get(i));
                ind = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            Emp.set(ind, emp);
            return "Updated successfully!!!";
        } else {
            return "No such Employee is present";
        }
    }
=======
>>>>>>> 77bafe60f243fffec7048391f1c2f4f96a20aa42
}
