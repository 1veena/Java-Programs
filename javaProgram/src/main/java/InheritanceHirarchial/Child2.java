package InheritanceHirarchial;

public class Child2 extends ParentClass1Ex{
	public void method3() {
		System.out.println("Child class 2");
	}

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method3();
		c2.method1();

	}

}
