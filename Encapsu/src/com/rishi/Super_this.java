

package com.rishi;


class Mobile {
	 int num=90; 
	 float model;
	 String name;
	 Mobile()
	 {
		 this(0.0f,"OLD phone");
		 model=0.1f;
		 name="phone";
		 System.out.println(model);
		 System.out.println(name);
		 System.out.println("parents constructor");
	 }
	 Mobile(float mo,String na)
	 {
		 this("Santanu");
		 model=mo;
		 name=na;
		 System.out.println(model);
		 System.out.println(name);
		 System.out.println("parent class parameterized constructor");
		
	 }
	 Mobile(String name)
	 {
		 this.name=name;
		 System.out.println(name);
		 System.out.println("param contain only string ");
		 System.out.println();
	 }
	    void methood()
		{
			if(num>90)
			System.out.println("GREATER");
			else if(num==90)
		    System.out.println("EQUAl");
			else
			System.out.println("SMALLER");
		}
	
}
class Smartphone extends Mobile {
	int number;
	String type;
	
	Smartphone()
	{
		number=909;
		type="Smartphone";
		System.out.println(number);
		System.out.println(type);
		System.out.println("child class constructor");
	}
	Smartphone(int number,String type)
	{
		//super(0.0f,"value");
		this.number=number;
		this.type=type;
		System.out.println(number);
		System.out.println(type);
		System.out.println("child class parameterix=zed constructor");
	}
	
	
}
public class Super_this {

	public static void main(String[] args) {
		Smartphone s=new Smartphone(790,"rishitaphone");
		s.methood();

	}

}
