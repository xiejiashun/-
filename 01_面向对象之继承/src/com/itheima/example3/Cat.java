package com.itheima.example3;
//继承：extends
public class Cat extends Animal{
	//1.空参够构造和有参构造
	public Cat(){}
	public Cat(String color,int leg){
		//super--this 
		//this:当前对象
		//supper:当前对象的父类对象
		super(color,leg);//super("bluer",4) 
	}

}
