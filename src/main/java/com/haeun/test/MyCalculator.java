package com.haeun.test;

//Calculator 클래스에 의존
public class MyCalculator {	
	private int num1;
	private int num2;
	
	Calculator cal;	//의존 설정(멤버객체에 의존)
	
	public void add() {
		cal.add(num1, num2);
	}
	public void sub() {
		cal.sub(num1, num2);
	}
	public void mul() {
		cal.mul(num1, num2);
	}
	public void div() {
		cal.div(num1, num2);
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public Calculator getCal() {
		return cal;
	}
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	
	
}