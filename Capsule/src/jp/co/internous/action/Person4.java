package jp.co.internous.action;

public class Person4 {

	private String name = null;
	private int age = 0;

	public Person4 (String name,int age){

		this.name = name;
		this.age = age;

	}

	public String getName(){

		return this.name;

	}

	public int getAge(){

		return this.age;
	}

	public void setAge(int age){

		this.age = age;
	}

	public void setName(String name){

		this.name = name;

	}

}
