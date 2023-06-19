package advanced;

public class Local {
	private static int age=50;
	private int level=9;
	
	
	
	public void detail() {
		final String name="david";
		int j=20;
		
		 class Inner{
			 public void  print() {
				 System.out.println(name);
				 System.out.println(age);
				 System.out.println(level);
				 System.out.println(j);
			 }
			
		}
		 Inner obj = new Inner();
		 obj.print();
		
	}
	
	
	
	
	public static void main(String a[]) {
		Local obj2 = new Local();
	
		obj2.detail();
	}

}
