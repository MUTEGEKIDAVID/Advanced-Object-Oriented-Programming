package advanced;

import java.io.*;

public class Person implements Externalizable {
    private String name;
    private int age;

    public Person() {
        // default constructor required for Externalizable
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Write the object's state to the output stream
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Read the object's state from the input stream
        name = (String) in.readObject();
        age = in.readInt();
    }

    public static void main(String[] args) {
        Person p = new Person("Alice", 30);

        try {
            // Serialize the object to a file
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        }

        Person p2 = null;

        try {
            // Deserialize the object from a file
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            p2 = (Person) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found");
            c.printStackTrace();
            return;
        }

        // Print the deserialized object's fields
        System.out.println("Deserialized Person:");
        System.out.println("name = " + p2.name);
        System.out.println("age = " + p2.age);
    }
}

