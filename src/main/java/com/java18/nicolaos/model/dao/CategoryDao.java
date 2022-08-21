package com.java18.nicolaos.model.dao;

import java.util.HashMap;
import java.util.List;

import com.java18.nicolaos.model.UsedCategory;

public interface CategoryDao {
	
	//create function
	public UsedCategory createCategory(String name, Integer parentId);

	//read function
	public List<UsedCategory> getCategoryList();
	
	//delete
	public HashMap<String, String> deleteCategory(Integer id);
	
	//update
	public UsedCategory updateCategory(UsedCategory usedCategory);
	
	

}
