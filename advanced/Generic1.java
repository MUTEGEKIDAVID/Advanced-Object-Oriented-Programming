package advanced;

public class Generic1 {
	static <T> void printValue(T element) {
		System.out.println("My value is"+ element);
	}
	
	
	public static void main(String a[]) {
		Generic1 obj= new Generic1();
		obj.printValue("DAvid");
		
		printValue(10);
	}

}
