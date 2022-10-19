package dataAcces.CategoryDataAccess;

import entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category added to database with JDBC: " + category.getName());
		
	}
	
	

}
