package sbrest.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import sbrest.model.Student;
import sbrest.model.StudentGroup;
import sbrest.model.dao.StudentDao;

@RestController
@RequestMapping("/students")
public class StudentsController {

	@Autowired 
	private StudentDao studentDao;
	
	@GetMapping
	public List<Student> list(){
		List<Student> students = studentDao.getStudents();
		return students;
	}
	
	@GetMapping("/groups")
	public List<StudentGroup> getGroups(){
		List<StudentGroup> groups = studentDao.getGroups();
		return groups;
	}
	
	@GetMapping("{/id}")
	public Student getStudentById( @PathVariable Integer id ){
		Student student = studentDao.getStudentById( id );
		if( student == null )
            throw new ResponseStatusException( HttpStatus.NOT_FOUND,
                "Student not found" );
        return student;
	}
	
}
 