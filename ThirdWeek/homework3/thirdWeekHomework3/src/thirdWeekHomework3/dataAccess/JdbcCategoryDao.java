package thirdWeekHomework3.dataAccess;

import thirdWeekHomework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
