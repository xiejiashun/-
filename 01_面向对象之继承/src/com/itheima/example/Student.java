package com.itheima.example;

/**
 * 1.˽�л���Ա����
 * 2.�ղκ��вι���
 * 3.set/get
 * 4.��Ա����
 * ѧ���࣬���������������䣬��Ϊ�гԷ���˯����ѧϰ
 */
public class Student {
	private String name;
	private int age;
	
	/**
	 * ���췽���������������������
	 * public ������xxx��{}
	 */
	public Student(){ }
	//�����ķ���ԭ�򣺾ͽ�ԭ��
	public Student (String name,int age){
		this.name=name;
		this.age=age;
	}
	/**
	 * 1.������Ȩ�����η�
	 * 2.�����ķ���ֵ���ͣ������
	 * 3.�����ķ�����
	 * 4.�����Ĳ����б����룩
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
