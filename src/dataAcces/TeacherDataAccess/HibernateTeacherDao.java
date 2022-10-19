package dataAcces.TeacherDataAccess;

import entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Teacher added to Database with Hibernate " + teacher.getFirstName() + teacher.getLastName());
		
	}
	
	

}
