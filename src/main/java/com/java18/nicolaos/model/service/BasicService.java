package com.java18.nicolaos.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.java18.nicolaos.model.UsedCategory;
import com.java18.nicolaos.model.User;

public class BasicService {

	public String func1() {
		return "SUCCESS";
	}
	
	public Integer func2() {
		return 1;
	}
	
	public ArrayList<String> func3(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("ONE");
		list.add("TWO");
		return list;
	}
	
	public HashMap<String,String> func4() {
		HashMap<String,String> status = new HashMap<String,String>();
		status.put("status", "SUCCESS");
		return status;
	}
	
	public User func5() {
		User user = new User();
		user.setId(1);
		user.setUserName("Wendy");
		return user;
	}
	
	public UsedCategory func6() {
		UsedCategory usedCategory = new UsedCategory();
		usedCategory.setId(2);
		usedCategory.setName("pants");
		return usedCategory ;
	}
	
	public void func7(String woo) {
		woo = "無";
	}
	
	public static void main(String[] args) {
		BasicService bc = new BasicService();
		String success = bc.func1();
		Integer num = bc.func2();
		ArrayList<String> Alist = bc.func3();
		HashMap<String, String> successStatus = bc.func4();
		User user = bc.func5();
		UsedCategory category = bc.func6();
		
		String wooo = null;
		bc.func7(wooo);
		
		System.out.println(success);
		System.out.println(num);
		System.out.println(Alist);
		System.out.println(successStatus);
		System.out.println(user);
		System.out.println(category);
		
	}

}
