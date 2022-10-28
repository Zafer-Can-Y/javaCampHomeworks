package thirdWeekHomework3.entities;

public class Category {
	private int id;
	private String categoryName;
	private String categoryDescription;

	public Category() {

	}

	public Category(int id, String categoryName, String categoryDescription) {
		this.id = id;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String catagoryName) {
		this.categoryName = catagoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String catagoryDescription) {
		this.categoryDescription = catagoryDescription;
	}

}
