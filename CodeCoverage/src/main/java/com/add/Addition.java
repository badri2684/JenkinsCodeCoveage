package com.add;

public class Addition {
	
	private int number1;
	
	private int number2;
	
	Addition(int number1,int number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	
	public int add(){
		return number1 + number2;
	}
	
}
