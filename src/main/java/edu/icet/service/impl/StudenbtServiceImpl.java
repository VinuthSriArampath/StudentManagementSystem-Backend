package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudenbtServiceImpl implements StudentService {
    @Autowired
    StudentRepository repository;


    @Override
    public Student searchStudentById(Integer id) {
        return repository.findByid(id);
    }

    @Override
    public void deletestudentbyid(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updatestudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return  repository.findAll();
    }


    @Override
    public void addStudent(Student student){
        repository.save(student);
    }
}
