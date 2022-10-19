import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import dataAcces.CategoryDataAccess.HibernateCategoryDao;
import dataAcces.CourseDataAccess.HibernateCourseDao;
import dataAcces.CourseDataAccess.JdbcCourseDao;
import dataAcces.TeacherDataAccess.HibernateTeacherDao;
import entities.Category;
import entities.Course;
import entities.Teacher;
import loggers.CategoryLogger;
import loggers.CourseLogger;
import loggers.DatabaseLogger;
import loggers.ILogger;
import loggers.TeacherLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1 = new Category(1, "Frontend");
		Category category2 = new Category(2, "Backend");
		Category category3 = new Category(3, "Game Development");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), new ILogger[] {new CategoryLogger(), new DatabaseLogger()});
		
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		
		Course course1 = new Course(1, "Java Course", 50, "3 Months");
		Course course2 = new Course(2, "Python Course", 60, "2 Months");
		Course course3 = new Course(3, "C# Course", 55, "4 Months");
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), new ILogger[] {new CourseLogger(), new DatabaseLogger()});
		
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		Teacher teacher1 = new Teacher(1, "Engin", "Demiroğ", 30);
		Teacher teacher2 = new Teacher(2, "Sude", "Küçüker", 22);
		Teacher teacher3 = new Teacher(3, "Şadi Evren", "Şeker", 30);
		
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), new ILogger[] {new TeacherLogger(), new DatabaseLogger()});
		
		teacherManager.add(teacher1);
		teacherManager.add(teacher2);
		teacherManager.add(teacher3);
		
		
	}

}
