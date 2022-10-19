package business;

import dataAcces.TeacherDataAccess.ITeacherDao;
import entities.Teacher;
import loggers.ILogger;

public class TeacherManager {
	
	private ITeacherDao teacherDao;
	private ILogger[] loggers;
	
	public TeacherManager(ITeacherDao teacherDao, ILogger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}
	
	
	public void add(Teacher teacher) {
		teacherDao.add(teacher);
		
		for(ILogger logger : loggers) {
			logger.log(teacher.getFirstName() + " " + teacher.getLastName());
		}
	}
	
	
}
