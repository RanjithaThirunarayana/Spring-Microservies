package sbrest.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import sbrest.model.Student;
import sbrest.model.StudentGroup;
import sbrest.model.dao.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao{

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<Student> getStudents() {
		return entityManager.createQuery( "from Student", Student.class )
	            .getResultList();
	}
	
	@Override
	public List<StudentGroup> getGroups() {
		return entityManager.createQuery( "from StudentGroup", StudentGroup.class )
	            .getResultList();
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Student.class, id);
	}
}
