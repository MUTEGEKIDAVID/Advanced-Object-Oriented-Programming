package advanced;

public class InnerTest {

	public static class x{
		public void printk() {
			System.out.println("this is my static inner calss");
		}
		
		
	}
	
	public class y{
		public void printk() {
			System.out.println("this is my  non static inner calss");
		}
		
	}
}
//InnerTest.x objx= new InnerTest.x();
//InnerTest obj = new InnerTest();
//InnerTest.x objx= obj.new x();