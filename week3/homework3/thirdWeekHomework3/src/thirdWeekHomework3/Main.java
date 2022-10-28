package thirdWeekHomework3;

import java.util.ArrayList;
import java.util.List;

import thirdWeekHomework3.business.CategoryManager;
import thirdWeekHomework3.business.CourseManager;
import thirdWeekHomework3.business.InstructorManager;
import thirdWeekHomework3.core.loging.DatabaseLogger;
import thirdWeekHomework3.core.loging.FileLogger;
import thirdWeekHomework3.core.loging.Logger;
import thirdWeekHomework3.core.loging.MailLogger;
import thirdWeekHomework3.dataAccess.HibernateCategoryDao;
import thirdWeekHomework3.dataAccess.HibernateCourseDao;
import thirdWeekHomework3.dataAccess.HibernateInstructorDao;
import thirdWeekHomework3.dataAccess.JdbcCategoryDao;
import thirdWeekHomework3.dataAccess.JdbcInstructorDao;
import thirdWeekHomework3.entities.Category;
import thirdWeekHomework3.entities.Course;
import thirdWeekHomework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = new Logger[] { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Yazılım");
		category1.setCategoryDescription("Java, JavaScript,.NET");
		Category category2 = new Category();
		category2.setId(2);
		category2.setCategoryName("Siber Güvenlik");
		category2.setCategoryDescription("İleri seviye");
		Category category3 = new Category();

		List<Category> categoryList = new ArrayList<>();

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryList);
		categoryManager.add(category1);
		categoryManager.add(category2);

		System.out.println("----------------");

		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("Java");
		course1.setCoursePrice(100);
		Course course2 = new Course();
		course2.setId(2);
		course2.setCourseName("JavaScript");
		course2.setCoursePrice(150);

		List<Course> courseList = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courseList);
		courseManager.add(course1);
		courseManager.add(course2);

		System.out.println("----------------");

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setInstructorSalary(0);

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);

	}

}
