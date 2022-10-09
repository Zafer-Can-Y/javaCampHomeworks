package thirdWeekHomework3.dataAccess;

import thirdWeekHomework3.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanıns eklendi");

	}

}
