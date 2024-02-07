
class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	public void setAge(int i) {
		// TODO Auto-generated method stub
		this.age=i;
	}
}

public class CloneableExample {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        try {
            // Creating a shallow copy using clone
            Person person2 = (Person) person1.clone();

            System.out.println("Original Person: " + person1);
            System.out.println("Cloned Person: " + person2);

            // Modifying the original person
            person1.setName("Jane");
            person1.setAge(30);

            System.out.println("After modification:");
            System.out.println("Original Person: " + person1);
            System.out.println("Cloned Person: " + person2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
