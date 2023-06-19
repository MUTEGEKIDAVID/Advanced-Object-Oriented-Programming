package advanced;
import java.util.Scanner;

public class lecture1 {
	lecture1()  
	{  
	this(80, 90);  
	System.out.println("Base class default constructor called");  
	}  
	//base class parameterized constructor  
	lecture1(int x, int y)  
	{  
	System.out.println("Base class parameterized constructor called");  
	}  
	} 



  /*
   * OBJECT IMMUTABILITY
   * it helps us understand the purpose of object mutability.
   * An immutable object is one whose state can not change once its state has been set.
   * such kind of situations help us to create secure systems where there is need.
   * 
   * immutable classes:
   * -prevent people from extending such a class or even overriding the methods.
   * 
   * OBJECT INTERNING(HAPPENS MAINLY IN STRINGS)
   * -use of the intern() method
   * -why intern objects save memory compared to not interning
   * 
   * SERIALIZATION/DESERIALIZATION AND EXTERNALIZATION
   * -why serialization is so important.
   * -
   * OBJECT CASTING
   * both explicit and implicit casting of objects/ we will see the importance
   * 
   * */
