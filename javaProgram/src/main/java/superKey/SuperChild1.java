package superKey;

public class SuperChild1 extends SuperParent1{
	public void display() {
		System.out.println("Child class");
	}
public void tell() {
	display();
	super.display();
	int s=10;
	int r=2;
	int sum=s+r;
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperChild1 c=new SuperChild1();
c.tell();
	}

}
