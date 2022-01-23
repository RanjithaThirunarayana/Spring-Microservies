package sbrest.model.dao;

import java.util.List;

import sbrest.model.Student;
import sbrest.model.StudentGroup;

public interface StudentDao {
	
	List<Student> getStudents();
	
	List<StudentGroup> getGroups();
	
	public Student getStudentById(Integer id);
}
