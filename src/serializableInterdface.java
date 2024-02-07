

import java.io.*;
import java.io.*;

class Person1 implements Serializable {
	private static final long serialVersionUID = 1L; // Required for versioning

	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter and Setter methods

	@Override
	public String toString() {
		return "Person1{name='" + name + "', age=" + age + '}';
	}
}

public class serializableInterdface{
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// Serialize an object
		serializeObject();

		// Deserialize the object
		Person1 deserializedPerson1 = deserializeObject();

		// Display the deserialized object
		System.out.println("Deserialized Person1: " + deserializedPerson1);
	}

	private static void serializeObject() {
		Person1 Person1 = new Person1("John", 25);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F://Person1.ser"))) {
			oos.writeObject(Person1);
			System.out.println("Object has been serialized and saved to Person1.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Person1 deserializeObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person1.ser"));
			Object object = ois.readObject();

			//            if (object instanceof Person1) {
			return (Person1) object;
			//  }

			//        } catch (IOException | ClassNotFoundException e) {
			//            e.printStackTrace();
			//        }

			//  return null;
			// }
		}

	}
