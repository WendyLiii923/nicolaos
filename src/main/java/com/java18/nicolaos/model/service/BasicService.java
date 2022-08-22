package com.java18.nicolaos.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.java18.nicolaos.model.UsedCategory;
import com.java18.nicolaos.model.User;

public class BasicService {

	public String func1() {
		String success;
		success =  "SUCCESS";
		System.out.println(success);
		return success;
	}
	
	public Integer func2() {
		Integer num;
		num = 1;
		System.out.println(num);
		return num;
	}
	
	public ArrayList<String> func3(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("ONE");
		list.add("TWO");
		System.out.println(list);
		return list;
	}
	
	public HashMap<String,String> func4() {
		HashMap<String,String> status = new HashMap<String,String>();
		status.put("status", "SUCCESS");
		System.out.println(status);
		return status;
	}
	
	public User func5() {
		User user = new User();
		user.setId(1);
		user.setUserName("Wendy");
		System.out.println(user);
		return user;
	}
	
	public UsedCategory func6() {
		UsedCategory usedCategory = new UsedCategory();
		usedCategory.setId(2);
		usedCategory.setName("pants");
		System.out.println(usedCategory);
		return usedCategory ;
	}
	
	public void func7(String woo) {
		woo = "無";
	}
	
	public static void main(String[] args, String woo) {
		BasicService bc = new BasicService();
		bc.func1();
		bc.func2();
		bc.func3();
		bc.func4();
		bc.func5();
		bc.func6();
		bc.func7(woo);
	}

}
