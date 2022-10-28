package thirdWeekHomework3.dataAccess;

import thirdWeekHomework3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi");

	}

}
