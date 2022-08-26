package com.java18.nicolaos.model.dao;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java18.nicolaos.model.UsedCategory;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDaoImpl() {

	}

	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	private final String selectAllCategory = "FROM com.java18.nicolaos.model.UsedCategory";
	private final String selectCategoryById = "FROM com.java18.nicolaos.model.UsedCategory WHERE ID=:CATEGORYID";

	@Override
	public List<UsedCategory> getCategoryList() {
		Query<UsedCategory> check = getSession().createQuery(selectAllCategory, UsedCategory.class);

		List<UsedCategory> list = check.list();
		return list;
	}

	@Override
	public UsedCategory createCategory(String name, Integer parentId) {
		UsedCategory usedCategory = new UsedCategory();
		try {
			usedCategory.setName(name);
			usedCategory.setParentId(parentId);
			getSession().save(usedCategory);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return usedCategory;
	}

	@Override
	public HashMap<String, String> deleteCategory(Integer id) {
		HashMap<String, String> status = new HashMap<String, String>();
		try {
			Query<UsedCategory> result = getSession().createQuery(selectCategoryById, UsedCategory.class);
			result.setParameter("CATEGORYID", id);
			List<UsedCategory> list = result.list();
			list.isEmpty();
			if (list.isEmpty() == false) {
				UsedCategory deleteItem = list.get(0);
				getSession().delete(deleteItem);
			} else {
				status.put("status", "fail to find");
				System.out.println(status);
			}

		} catch (Exception e) {
			e.printStackTrace();
			status.put("status", "fail");
			System.out.println(status);
		}
		status.put("status", "success");
		System.out.println(status);
		return status;
	}

	@Override
	// 未完成
	public UsedCategory updateCategory(UsedCategory usedCategory) {
		UsedCategory us = new UsedCategory();
		try {
			Query<UsedCategory> find = getSession().createQuery(selectCategoryById, UsedCategory.class);
			find.setParameter("CATEGORYID", us.getId());
			List<UsedCategory> list = find.list();
			UsedCategory updateItem = list.get(0);
			updateItem.getName();
			getSession().save(updateItem);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return usedCategory;
	}

}
