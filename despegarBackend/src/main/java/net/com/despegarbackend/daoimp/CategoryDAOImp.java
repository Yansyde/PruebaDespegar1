package net.com.despegarbackend.daoimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.com.despegarbackend.dao.CategoryDAO;
import net.com.despegarbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImp implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("television");
		category.setDescription("iisifif");
		category.setImageURL("hola.png");
		categories.add(category);
		
		Category category1 = new Category();
		category1.setId(2);
		category1.setName("laptop");
		category1.setDescription("iisifif");
		category1.setImageURL("hola.png");
		categories.add(category1);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
for (Category category : categories) {
	if (category.getId() == id) return category; 			
}
		return null;
	}

}
