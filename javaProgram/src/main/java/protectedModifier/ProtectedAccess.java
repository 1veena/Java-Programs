package protectedModifier;

public class ProtectedAccess {
protected void example() {
	System.out.println("Print Protected access modifier");
}
	public static void main(String[] args) {
		ProtectedAccess p = new ProtectedAccess();
		p.example();
		
	}

}
