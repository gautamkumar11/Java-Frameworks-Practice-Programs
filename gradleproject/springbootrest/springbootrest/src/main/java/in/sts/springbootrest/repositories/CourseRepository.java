package in.sts.springbootrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sts.springbootrest.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
