package com.itheima.example3;
//��˽�л��ĳ�Աֻ�����ڱ����з��ʣ����������������н��з���
public class Animal{
	private String color;
	private int leg;
	public Animal(){}
	public Animal(String color,int leg){
		this.color=color;
		this.leg=leg;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public void sleep (){
		System.out.println("˯��");
	}
	public void eat(){
		System.out.println("�Է�");
	}
}
