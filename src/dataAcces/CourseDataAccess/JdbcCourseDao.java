package dataAcces.CourseDataAccess;

import entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to Database with JDBC " + course.getName());
		
	}

}
