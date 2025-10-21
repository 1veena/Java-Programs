package InheritanceHirarchial;

public class Child1 extends ParentClass1Ex{
public void method2() {
	System.out.println("Child class one");
}

	public static void main(String[] args) {
	
Child1 c1 = new Child1();
c1.method1();
c1.method2();
	}

}
