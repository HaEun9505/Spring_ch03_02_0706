package com.haeun.test;

public class Calculator {
	
	public void add(int num1, int num2) {	//파라미터 값으로 호출
		int result = num1 + num2;
		System.out.println("두 수의 합: " + result);
	}
	
	public void sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("두 수의 차: " + result);
	}
	
	public void mul(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("두 수의 곱: " + result);
	}
	
	public void div(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("두 수 나누기: " + result);
	}
	
}