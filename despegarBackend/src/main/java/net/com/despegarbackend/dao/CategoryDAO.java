package net.com.despegarbackend.dao;

import java.util.List;

import net.com.despegarbackend.dto.Category;


public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
