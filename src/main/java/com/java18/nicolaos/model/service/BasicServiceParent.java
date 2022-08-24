package com.java18.nicolaos.model.service;

public class BasicServiceParent {
	protected int funcP1(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	
	protected int funcP2(int num1, int num2) {
		int ans;
		ans = num1 - num2;
		return ans;
	}
	
	protected int funcP3(int num1, int num2) {
		int ans3;
		ans3 = num1 * num2;
		return ans3;
	}
	
}
