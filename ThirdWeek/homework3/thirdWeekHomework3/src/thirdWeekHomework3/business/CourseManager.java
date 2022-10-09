package thirdWeekHomework3.business;

import java.util.List;

import thirdWeekHomework3.core.loging.Logger;
import thirdWeekHomework3.dataAccess.CourseDao;
import thirdWeekHomework3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		if (course.getCoursePrice() <= 0) {
			throw new Exception("Kurs fiyatı uygun değil!");
		}

		for (Course cr : courses) {
			if (cr.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs adı mevcut!");
			}
		}

		courseDao.add(course);
		courses.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}

	}

}
