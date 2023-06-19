package advanced;
import java.util.Scanner;

public class classWithMain extends lecture1 {
	classWithMain()  
	{  
	this("Java", "Python");  
	System.out.println("Derived class default constructor called");  
	}  
	//derived class parameterized constructor  
	classWithMain(String str1, String str2)  
	{  
	super();  
	System.out.println("Derived class parameterized constructor called");  
	}  
	 
	
	public static void main(String args[])   
	{   
	//initializes the instance of example class  
	classWithMain my_example = new classWithMain ();  
	  
	
	
	
	
	
	
		
	}

}
