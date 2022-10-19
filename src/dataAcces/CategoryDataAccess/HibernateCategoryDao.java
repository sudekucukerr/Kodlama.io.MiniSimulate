package dataAcces.CategoryDataAccess;

import entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Category added to database with Hibernate: " + category.getName());
		
	}

}
