package com.java18.nicolaos.model.basicService;

import java.util.ArrayList;

public class BasicServiceChild extends BasicService{

	public static void main(String[] args) {
		BasicServiceChild bsc = new BasicServiceChild();
//		int ans1 = bsc.funcP1(6, 5);
//		System.out.println(ans1);
		
		int ans2 = bsc.funcP2(6, 5);
		System.out.println(ans2);
		
		int ans3 = bsc.funcP3(6, 5);
		System.out.println(ans3);
		
		String ans4 = bsc.func1();
		System.out.println(ans4);
		
		Integer ans5 = bsc.func2();
		System.out.println(ans5);
		
		ArrayList<String> ans6 = bsc.func3();
		System.out.println(ans6);
	}

}
