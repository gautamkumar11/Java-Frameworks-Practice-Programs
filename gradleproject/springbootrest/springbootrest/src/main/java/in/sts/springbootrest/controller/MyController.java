package in.sts.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.sts.springbootrest.entities.Course;
import in.sts.springbootrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/envdetails")
	public String envDetails()
	{
		return env.toString();
	}
	
	@Profile(value = "dev")
	@GetMapping("/home")
	@Bean
	public String home() {
		
		return "welcome To Course Application";
	}
	
	@Profile(value = "test")
	@RequestMapping(path = "/courses", method = RequestMethod.GET)
	public List<Course>  getCourse()
	{
		
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Integer.parseInt(courseId));
	}
	
	@PostMapping(path = "/courses", consumes = "application/json")
	public Course addCourse(@RequestBody Course course)
	{
		
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Course deleteCourse(@PathVariable String courseId)
	{
		return this.courseService.deleteCourse(Integer.parseInt(courseId));
	}
}
