package com.java18.nicolaos.model.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import com.java18.nicolaos.model.UsedCategory;
import com.java18.nicolaos.model.User;

import javassist.compiler.ast.Member;

public class BasicService extends BasicServiceParent{
	public static void main(String[] args) {
		BasicServiceParent BSP = new BasicServiceParent();
		int funp1 = BSP.funcP1(6, 5);
		System.out.println(funp1);
		
		int funp2 = BSP.funcP2(6, 5);
		System.out.println(funp2);
		
		int funp3 = BSP.funcP3(6, 5);
		System.out.println(funp3);
	}
	
	
	/** part 5 */
//	public static void main(String[] args) {
//		BasicVO vo1 = new BasicVO();
//		System.out.println(vo1);
//		
//		int id2 = 5;
//		String name2 = "66";
//		BasicVO vo2 = new BasicVO(id2, name2);
//		System.out.println(vo2);
//		
//		
//		int id3 = 2;
//		String name3 = "33";
//		boolean isActive3 = true;
//		Timestamp createTime3 = new Timestamp(System.currentTimeMillis());
//		BasicVO vo3 = new BasicVO(id3, name3, isActive3, createTime3);
//		System.out.println(vo3);
//	}
	
	
	/** part 2 */
//	public static int funcS1(int num1, int num2) {
//		int sum;
//		sum = num1 + num2;
//		return sum;
//	}
//
//	public static String[] funcS2(String word1, String word2) {
//		String[] arr = new String[2];
//		arr[0] = word1;
//		arr[1] = word2;
//		return arr;
//	}
//
//	public static ArrayList<String> funcS3(String phone1, String phone2) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add(phone1);
//		list.add(phone2);
//		return list;
//	}
//
//	public static HashMap<String, String> funcS4(String value) {
//		HashMap<String, String> payload = new HashMap<String, String>();
//		payload.put("payload", value);
//		return payload;
//	}
//
//	public static User funcS5(User oldUser) {
//		int userId = 5;
//		String userName = "Peter";
//		oldUser.setId(userId);
//		oldUser.setUserName(userName);
//		return oldUser;
//	}
//
//	public static UsedCategory funcS6(UsedCategory oldCategory) {
//		int categoryId = 2;
//		String categoryName = "Hats";
//		oldCategory.setId(categoryId);
//		oldCategory.setName(categoryName);
//		return oldCategory;
//	}
//
//	public static void funcS7(String woo) {
//		woo = "無";
//	}
//	
//	public static void main(String[] args) {
//		int num = BasicService.funcS1(1, 2);
//		String[] array = BasicService.funcS2("w","ww");
//		ArrayList<String> Alist = BasicService.funcS3("apple","asus");
//		HashMap<String, String> payload = BasicService.funcS4("有效載荷");
//		
//		User oldUser = new User();
//		User newUser = BasicService.funcS5(oldUser);
//		
//		UsedCategory oldCategory = new UsedCategory();
//		UsedCategory newCategory = BasicService.funcS6(oldCategory);
//
//		String wooo = null;
//		BasicService.funcS7(wooo);
//
//		System.out.println(num);
//		System.out.println(array);
//		System.out.println(Alist);
//		System.out.println(payload);
//		System.out.println(newUser);
//		System.out.println(newCategory);
//	}

	
	/** part 1 */ 
//	public String func1() {
//		return "SUCCESS";
//	}
//
//	public Integer func2() {
//		return 1;
//	}
//
//	public ArrayList<String> func3() {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("ONE");
//		list.add("TWO");
//		return list;
//	}
//
//	public HashMap<String, String> func4() {
//		HashMap<String, String> status = new HashMap<String, String>();
//		status.put("status", "SUCCESS");
//		return status;
//	}
//
//	public User func5() {
//		User user = new User();
//		user.setId(1);
//		user.setUserName("Wendy");
//		return user;
//	}
//
//	public UsedCategory func6() {
//		UsedCategory usedCategory = new UsedCategory();
//		usedCategory.setId(2);
//		usedCategory.setName("pants");
//		return usedCategory;
//	}
//
//	public void func7(String woo) {
//		woo = "無";
//	}
//
//	public static void main(String[] args) {
//		BasicService bc = new BasicService();
//		String success = bc.func1();
//		Integer num = bc.func2();
//		ArrayList<String> Alist = bc.func3();
//		HashMap<String, String> successStatus = bc.func4();
//		User user = bc.func5();
//		UsedCategory category = bc.func6();
//
//		String wooo = null;
//		bc.func7(wooo);
//
//		System.out.println(success);
//		System.out.println(num);
//		System.out.println(Alist);
//		System.out.println(successStatus);
//		System.out.println(user);
//		System.out.println(category);
//
//	}
	
}
