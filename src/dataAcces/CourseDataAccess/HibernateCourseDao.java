package dataAcces.CourseDataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to Database with Hibernate " + course.getName());
		
	}
	
	

}
