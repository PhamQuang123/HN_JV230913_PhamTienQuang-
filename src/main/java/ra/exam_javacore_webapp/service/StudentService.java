package ra.exam_javacore_webapp.service;

import ra.exam_javacore_webapp.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    boolean save(Student student);
    boolean update(Student student);
    boolean deleteById(Integer studentId);
    List<Student> findByName(String studentName);
    Student findById(int studentId);
}
