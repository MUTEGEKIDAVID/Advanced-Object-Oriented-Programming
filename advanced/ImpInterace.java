package advanced;

public class ImpInterace {
	public static void main(String a[]) {
		
		
		MyInterface inter =new MyInterface() {
//			public int add() {
//				System.out.println("welcome to anonymous"); 
//				return 4+5;
//			}
			public void print() {
				System.out.println("k");
			}
		};
		
		
		
		inter.print();
		
		
	}

}
