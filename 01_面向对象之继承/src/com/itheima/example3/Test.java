package com.itheima.example3;

public class Test {
	public static void main(String[] args) {
		Cat c =new Cat("Blue",4);
		int leg = c.getLeg();//getColor是父类的公开的方法
		String color = c.getColor();
		System.out.println(leg+"..."+color);
	}
}
