package com.java18.nicolaos.used.model.test;

public class BasicServiceParent {
	private int funcP1(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	
	protected int funcP2(int num1, int num2) {
		int ans;
		ans = num1 - num2;
		return ans;
	}
	
	public int funcP3(int num1, int num2) {
		int ans3;
		ans3 = num1 * num2;
		return ans3;
	}
	
}
