package com.rishi;
class Cat{
	private String name;
	private int age;
	private int cost;
	public Cat(){
		this("Rahi",8000);
		name="pushi";
		age=15;
		cost=500;
	}
	public Cat(String name, int age,int cost) {
	
		this.name=name;
		this.age=age;
		this.cost=cost;
	}
	public Cat(String name,int cost) {
		
		this.name=name;
		this.cost=cost;
	}
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Cat c=new Cat();
		//Cat b=new Cat("Vashi",10,2000);
		System.out.println(c.getName()+c.getAge()+c.getCost());
		c.setName("Sheru");
        System.out.println(c.getName());
	}

}
