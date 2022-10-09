package thirdWeekHomework3.business;

import java.util.List;

import thirdWeekHomework3.core.loging.Logger;
import thirdWeekHomework3.dataAccess.CategoryDao;
import thirdWeekHomework3.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {

		for (Category ct: categories) {
			if (ct.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori adı mevcut!");
			}
		}
		categoryDao.add(category);
		categories.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

}
