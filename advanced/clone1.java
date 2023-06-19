package advanced;


	class Person implements Cloneable {
	    public String name;
	    public Address address;
	    
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	}

	class Address {
	    public String street;
	    public String city;
	}

	public class clone1 {
	    public static void main(String[] args) throws CloneNotSupportedException {
	        Address address = new Address();
	        address.street = "123 Main St";
	        address.city = "Anytown";
	        
	        Person person1 = new Person();
	        person1.name = "John";
	        person1.address = address;
	        
	        Person person2 = (Person)person1.clone();
	        person2.name = "Jane";
	        person2.address.street = "456 Main St";
	        
	        System.out.println(person1.name); // Output: John
	        System.out.println(person1.address.street); // Output: 456 Main St
	    }
	}



