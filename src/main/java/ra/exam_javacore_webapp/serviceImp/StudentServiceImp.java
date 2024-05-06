package ra.exam_javacore_webapp.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.exam_javacore_webapp.model.Student;
import ra.exam_javacore_webapp.repository.StudentRepository;
import ra.exam_javacore_webapp.service.StudentService;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean update(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public boolean deleteById(Integer studentId) {
        return studentRepository.deleteById(studentId);
    }

    @Override
    public List<Student> findByName(String studentName) {
        return studentRepository.findByName(studentName);
    }

    @Override
    public Student findById(int studentId) {
        return null;
    }
}
