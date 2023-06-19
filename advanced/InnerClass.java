package advanced;

public class InnerClass {
	
	private static String name="mark";
	private int age=24;
	
	public void Show() {
		System.out.println("this is outer");
		
	}
	
	public  class K{
		
		public void Show() {
			System.out.println("this is inner");
		}
		
		
		public void printDetail() {
			
			InnerClass ob = new InnerClass();
			System.out.println(name);
			System.out.println(ob.age);
			
			Show();
			
		
		}
	}
}
