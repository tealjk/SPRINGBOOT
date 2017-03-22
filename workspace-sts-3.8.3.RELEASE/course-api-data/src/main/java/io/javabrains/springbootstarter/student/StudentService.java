package io.javabrains.springbootstarter.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository; 
	
	
	

	private List<Student> students = new ArrayList<> (Arrays.asList(
			new Student("student", "string Framewokr", "Descritp"),
			new Student("bob", "string bob", "Descritp"),
			new Student("bill", "string bill", "Descritp")
			));


	
	public List<Student> getAllStudents(){
		// return students; 
		List<Student> students = new ArrayList<>();
		studentRepository.findAll()
		.forEach(students::add);
		return students;
	}
	

	
	
	public Student getStudent(String id){
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return studentRepository.findOne(id);
		
		
		
	}
	
	
	
	
	
	
	
	
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}
	
	
	public void updateStudent(String id, Student student) {
	/*
	for (int i =0; i < topics.size(); i++ ) {
		Topic t = topics.get(i);
		if (t.getId().equals(id)){
			topics.set(i, topic);
			return;
		}
	}
	*/
	
		studentRepository.save(student);
		
	}


public void deleteStudent(String id) {
	
	//topics.removeIf(t -> t.getId().equals(id));
	
	studentRepository.delete(id);
	
}
}




