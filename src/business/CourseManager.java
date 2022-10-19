package business;

import java.util.ArrayList;
import java.util.List;

import dataAcces.CourseDataAccess.ICourseDao;
import entities.Course;
import loggers.ILogger;

public class CourseManager {
	
	private ICourseDao courseDao;
	private ILogger[] loggers;
	public List<String> listCourseName = new ArrayList<String>();
	
	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void  add(Course course) throws Exception{
		
		if(listCourseName.size() == 0) {
			listCourseName.add(course.getName());
			courseDao.add(course);
		}
		else {
			if(listCourseName.contains(course.getName())) {
				throw new Exception("This course name already exist!!");
			}
			else {
				listCourseName.add(course.getName());
				courseDao.add(course);
			}
			
			if(course.getPrice()<0) {
				throw new Exception("Course price cannot be lower than 0$");
			}
			
			for (ILogger logger : loggers) {
				logger.log(course.getName());
			}
		}
		
	}
	

}
