package business;

import java.util.ArrayList;
import java.util.List;

import dataAcces.CategoryDataAccess.ICategoryDao;
import entities.Category;
import loggers.ILogger;

public class CategoryManager {
	
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	public List <String> listCategoryName = new ArrayList<String>();

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		
		if(listCategoryName.size() == 0) {
			listCategoryName.add(category.getName());
			categoryDao.add(category);
		} 
		else {
			if(listCategoryName.contains(category.getName())) {
				throw new Exception("This category name already exist!!");
			}
			else {
				listCategoryName.add(category.getName());
				categoryDao.add(category);
			}
			
			for (ILogger logger : loggers) {
				logger.log(category.getName());
			}
		}
		
	}
}
	
	