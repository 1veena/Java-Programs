package accessModifier;

public class PrivateModifier {

	private void display()
	{
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		
	PrivateModifier d = new PrivateModifier();
	d.display();
	
	}

}
