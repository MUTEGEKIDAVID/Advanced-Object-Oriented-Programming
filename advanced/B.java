package advanced;

public class B extends Implicitcasting{
	String name="David ";
	
	public void makeSound() {
        System.out.println("Dog is barking.");
    }
    
    public void playFetch() {
        System.out.println("Dog is playing fetch.");
    }
	
	public static void main(String a[]) {
		
		B obj= new B();
		obj.print(new B());
		
		Implicitcasting obj2 = new B();//implicit casting
		B obj3 = (B)obj2;//explicit casting
		
		obj2.makeSound();
		 System.out.println(obj2.name);
		 
		 System.out.println("...........Explicit casting..........");
		 
		 obj3.makeSound();
		 System.out.println(obj3.name);
		 obj3.playFetch();
		 
		 
		 
		
	}
}
