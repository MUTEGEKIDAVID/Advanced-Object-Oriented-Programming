package advanced;

public class OuterInner {
	private class inner{
		public static int age=50;
		public int count =40;
	}
	
	public void printdetail() {
		inner obj = new inner();
		System.out.println(inner.age);
		System.out.println(obj.age);
		System.out.println(obj.count);
		System.out.println(obj.count);

	}

}
