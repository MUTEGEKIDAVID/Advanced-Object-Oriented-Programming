package advanced;

public class DeepClone {

}

class Address implements Cloneable{
	
	String city;
	String country;
	
	
	public Object Clone() throws CloneNotSupportedException{
		return super.clone();
	}
}


class Person implements Cloneable{
	
	String name;
	int age;
	Address address;
	
	public Object Clone() throws CloneNotSupportedException{
		
		Person p = (Person) super.clone();
		
		p.address = (Address) address.Clone();
		
		return p;
	}
	
	
	public static void main(String[] args) {
		
	
	}
}