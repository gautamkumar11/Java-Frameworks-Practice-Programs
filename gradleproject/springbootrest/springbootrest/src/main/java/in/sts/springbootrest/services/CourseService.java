package in.sts.springbootrest.services;

import java.util.List;

import in.sts.springbootrest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(int courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course deleteCourse(int courseId);
}
