package advanced;
import java.lang.*;
public class ClassIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "This is TutorialsPoint";//this string is automatically interned
	     
	      // returns canonical representation for the string object
	      String str2 = str1.intern();
	     
	      // prints the string str2
	      System.out.println(str2);
	     
	      // check if str1 and str2 are equal or not
	      System.out.println("Is str1 equal to str2 ? = " + (str1 == str2));
	      
	      String s1=new String("hello");  //not in the string pool
	      String s2="hello";
	      String s5=s2.intern();//the .intern is nt necessary in this case
	      String s3=s1.intern();//returns string from pool, now it will be same as s2  
	      System.out.println(s1==s2);//false because reference variables are pointing to different instance  
	      System.out.println(s2==s3);//true because reference variables are pointing to same instance 
	      System.out.println(s2==s5);
	      System.out.println(s2.equals(s2));// this will be true because the two strings have the same value
	      

	}

}
/**
 * public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); // Output: true
        System.out.println(str1 == str3); // Output: false
        System.out.println(str1.equals(str3)); // Output: true

        String str4 = str3.intern();
        System.out.println(str1 == str4); // Output: true
    }
}

The SCP is an area inside the heap memory

In the above example, we create three string objects: str1, str2, and str3. Both str1 and str2 are string literals, so they are interned by the Java runtime environment. When comparing str1 and str2 using the == operator, the result is true because they refer to the same interned string object in the string pool.

On the other hand, str3 is created using the new keyword, so it is a separate string object not interned by default. Comparing str1 and str3 using the == operator results in false because they refer to different string objects, even though their contents are the same. However, comparing them using the equals() method yields true because it checks for string equality based on the content.

To explicitly intern a string, you can use the intern() method, as demonstrated with str4 in the example. The intern() method returns a canonical representation of the string, ensuring that it is interned in the string pool. When comparing str1 and str4 using the == operator, the result is true because both references now point to the same interned string object.

It's worth noting that while string interning can save memory by reusing existing string objects, it should be used judiciously. Excessive use of string interning can lead to increased memory usage and slower performance due to the large size of the string pool. Therefore, it is generally recommended to rely on string interning for specific cases where string comparison is a performance bottleneck or when dealing with large numbers of unique string values.
 * */
 