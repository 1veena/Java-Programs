package inheritance;

public class ChildclassEx extends ParentClass{
public void method2() {
	System.out.println("Test Inheritance");
}
	public static void main(String[] args) {
		
ChildclassEx obj= new ChildclassEx();
obj.method1();
obj.method2();
	}

}
