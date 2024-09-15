package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface StudentService {
    void addStudent(Student student);
    Student searchStudentById(Integer id);
    void deletestudentbyid(Integer id);
    void updatestudent(Student student);
    List<Student> findAllStudents();
}
