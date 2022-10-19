package dataAcces.TeacherDataAccess;

import entities.Teacher;

public class JdbcTeacherDao implements ITeacherDao {
	
	@Override
	public void add(Teacher teacher) {
		System.out.println("Teacher added to Database with JDBC " + teacher.getFirstName() + teacher.getLastName());
		
	}

}
