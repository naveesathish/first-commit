package org.test;

public class A {
	public A() {
		this("Java");
		System.out.println("Default constructor");
	}

	public A(int id) {
		this(3456.5678f);
		System.out.println(id);
	}
     public A(String name) {
    	 this(12);
    	System.out.println("name");
   }
    public A(float sal) {
    	System.out.println(3456.5678f);
    }
    
    public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(12) ; 
		A a3 = new A("name");
		A a4 = new A(3456.5678f);
   
	
	}
}
