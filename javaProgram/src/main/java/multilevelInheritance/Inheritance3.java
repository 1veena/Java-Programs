package multilevelInheritance;

import accessModifier.DefaultModifier;

public class Inheritance3 extends Inheritance2{
	public void method3() {
		
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		
Inheritance3 obj = new Inheritance3();
obj.method1();
obj.method2();
obj.method3();
//DefaultModifier d= new DefaultModifier();
//d.print();
	}

}
