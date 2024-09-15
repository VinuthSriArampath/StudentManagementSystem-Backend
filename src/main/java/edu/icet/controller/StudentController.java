package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    final StudentService service;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return service.findAllStudents();
    }

    @PostMapping("/addstudent")
    public void addStudent(@RequestPart("student") Student student,@RequestPart("image") MultipartFile file) throws IOException {
        student.setImage(file.getBytes());
        service.addStudent(student);
    }

    @GetMapping("/searchbyid/{id}")
    public Student searchStudent(@PathVariable Integer id) {
        return service.searchStudentById(id);
    }

    @DeleteMapping("/deletestudent/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        service.deletestudentbyid(id);
    }

    @PatchMapping("/updatestudent")
    public void updateStudent(@RequestPart("student") Student student,@RequestPart("image") MultipartFile file) throws IOException {
        student.setImage(file.getBytes());
        service.updatestudent(student);
    }
}
