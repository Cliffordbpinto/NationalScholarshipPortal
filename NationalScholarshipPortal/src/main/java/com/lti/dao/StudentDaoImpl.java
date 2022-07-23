import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.Student;

@Component
public class StudentDaoImpl implements StudentDao{

	@PersistenceContext
	EntityManager em;
	

	@Transactional
	public Student addOrUpdateStudent(Student student) {
		Student StudentPersisted = em.merge(student);
		return StudentPersisted;
	}

	public Student searchStudentById(int studentId) {
		return em.find(Student.class, studentId);
	}

	
	

}
