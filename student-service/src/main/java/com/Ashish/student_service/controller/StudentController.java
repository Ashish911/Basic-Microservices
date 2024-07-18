package com.Ashish.student_service.controller;

import com.Ashish.student_service.model.Student;
import com.Ashish.student_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable String id) {
        return studentService.fetchStudentById(id);
    }

    @GetMapping
    public ResponseEntity<?> getAllStudents() {
        return studentService.fetchStudents();
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

}
