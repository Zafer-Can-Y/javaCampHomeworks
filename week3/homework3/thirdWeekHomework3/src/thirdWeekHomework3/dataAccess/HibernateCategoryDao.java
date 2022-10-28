package thirdWeekHomework3.dataAccess;

import thirdWeekHomework3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanıns eklendi");
	}

}
