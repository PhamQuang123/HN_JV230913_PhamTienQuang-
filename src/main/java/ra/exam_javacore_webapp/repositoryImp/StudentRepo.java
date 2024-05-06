package ra.exam_javacore_webapp.repositoryImp;

import org.springframework.stereotype.Repository;
import ra.exam_javacore_webapp.model.Student;
import ra.exam_javacore_webapp.repository.StudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class StudentRepo implements StudentRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("select st from Student st", Student.class).getResultList();
    }

    @Override
    public boolean save(Student student) {
        try {
            entityManager.persist(student);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        try {
            entityManager.merge(student);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteById(Integer studentId) {
        try {
            Student catalogDelete = findById(studentId);
            entityManager.remove(catalogDelete);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Student> findByName(String studentName) {
        return entityManager.createQuery("select st from Student st where st.studentName like :studentName", Student.class).getResultList();
    }

    @Override
    public Student findById(int studentId) {
        return entityManager.createQuery("select st from Student st where st.studentId=:id", Student.class)
                .setParameter("id", studentId).getSingleResult();
    }
}
