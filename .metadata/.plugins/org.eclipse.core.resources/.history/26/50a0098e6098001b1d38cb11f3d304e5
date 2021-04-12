package in.sts.springbootrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sts.springbootrest.entities.Course;
import in.sts.springbootrest.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	@Override
	public List<Course> getCourses() {
		list = new ArrayList<>();
		list = courseRepository.findAll();

		return list;
	}

	@Override
	public Course getCourse(int courseId) {
		
		//return courseRepository.findById(courseId).get();
		list = courseRepository.findAll();
		
		Course c = null;
		for(Course course : list)
		{
			if(course.getId()==courseId)
			{
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseRepository.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		//list.add(course);
		courseRepository.save(course);
		return course;
	}

	@Override
	public Course deleteCourse(int courseId) {
		Course c = null;
		list = courseRepository.findAll();
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c = course;
				courseRepository.delete(c);
				break;
			}
		}
		return c;
	}
	
	

}
