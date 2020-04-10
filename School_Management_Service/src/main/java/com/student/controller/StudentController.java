package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping(value = "/school-management",produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController{
	
	@Autowired
	private StudentService studentService;
	
	/* POST
	 * http://localhost:8080/school-management/addStudent 
	 *  {
    "sid": 5,
    "name": "Papun",
    "age": 23,
    "course": ".Net",
    "fee": 5000,
    "address": "Bangalore"
        }
    */
	@PostMapping(value = "/addStudent")
    public Student createOrSaveStudent(@RequestBody Student student) {
    	return studentService.addStudent(student);
    }
	
	/* GET
	 * http://localhost:8080/school-management/getStudents 
	 * */
	@GetMapping(value = "/getStudents")
	public List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	
	/* GET
	 * http://localhost:8080/school-management/getStudent/1
	 * */
	@GetMapping(value = "/getStudent/{sid}")
	public Student getStudentById(@PathVariable long sid) {
		return studentService.getStudentById(sid);
	}
	
	/* PUT
	 * http://localhost:8080/school-management/updateStudent
	 * {
    "sid": 4,
    "name": "Papun",
    "age": 25,
    "course": ".Net & angular",
    "fee": 5000,
    "address": "Bangalore"
       }
    */
	@PutMapping(value = "/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	/* DELETE
	 * http://localhost:8080/school-management/deleteStudent
	 * {
    "sid": 4,
    "name": "Papun",
    "age": 25,
    "course": ".Net & angular",
    "fee": 5000,
    "address": "Bangalore"
       }*/
	@DeleteMapping(value = "/deleteStudent")
	public void deleteStudent(@RequestBody Student student) {
		studentService.deleteStudent(student);
	}
	
	/* DELETE
	 * http://localhost:8080/school-management/deleteStudent/5
	 * */
	@DeleteMapping(value = "/deleteStudent/{sid}")
	public void deleteStudentById(@PathVariable long sid) {
		studentService.deleteStudentById(sid);
	}
	
	/* GET
	 * http://localhost:8080/school-management/countStudents
	 * */
	@GetMapping(value = "/countStudents")
	public long countStudents() {
		return studentService.countStudent();
	}
	
	/* GET
	 * http://localhost:8080/school-management/checkStudent/6 -->false
	 * http://localhost:8080/school-management/checkStudent/1 -->true
	 */
	@GetMapping(value = "/checkStudent/{sid}")
	public boolean checkStudent(@PathVariable long sid) {
		return studentService.isPresentOrNot(sid);
	}
	
}//class
