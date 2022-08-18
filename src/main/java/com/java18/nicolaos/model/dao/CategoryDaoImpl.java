package com.java18.nicolaos.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java18.nicolaos.model.UsedCategory;

@Repository
public class CategoryDaoImpl implements CategoryDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDaoImpl() {
		
	}
	
	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	private final String selectAllCategory = "FROM com.java18.nicolaos.model.UsedCategory";

	@Override
	public List<UsedCategory> getCategoryList() {
		Query<UsedCategory> check = getSession().createQuery(selectAllCategory, UsedCategory.class);
		
		List<UsedCategory> list = check.list();
		return list;
	}

}
