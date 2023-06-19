package advanced;

import java.io.*;

public class MyClass implements Serializable {
    private int age;
    public transient int transientAge = 90;

    public MyClass(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MyClass obj = new MyClass(42);
        System.out.println("Before serialization: age=" + obj.age + ", transientAge=" + obj.transientAge);

        // Serialize the object
        FileOutputStream fileOut = new FileOutputStream("myfile.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj);
        out.close();
        fileOut.close();

        // Deserialize the object
        FileInputStream fileIn = new FileInputStream("myfile.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        MyClass obj2 = (MyClass) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("After deserialization: age=" + obj2.age + ", transientAge=" + obj2.transientAge);
    }
}
