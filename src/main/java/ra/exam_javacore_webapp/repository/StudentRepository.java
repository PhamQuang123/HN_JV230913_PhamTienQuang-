package ra.exam_javacore_webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.exam_javacore_webapp.model.Student;

import java.util.List;

@Repository
public interface StudentRepository  {
    List<Student> findAll();
    boolean save(Student student);
    boolean update(Student student);
    boolean deleteById(Integer studentId);
    List<Student> findByName(String studentName);
    Student findById(int studentId);
}
