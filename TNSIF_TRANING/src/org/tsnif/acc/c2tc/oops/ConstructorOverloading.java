package org.tsnif.acc.c2tc.oops;


class Student4
{
	String name;
	int age;
	
	Student4()
	{
		System.out.println("Default constructor");
	}
	Student4(String name)
	{
		this.name=name;
		System.out.println("Name "+name);
	}
	Student4(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name "+ name +"Age "+age);	 
	}	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Student4 s1=new Student4();
		Student4 s2=new Student4("ganesh");
		Student4 s3=new Student4("gagan",22);
		
	
		
		

	}

}