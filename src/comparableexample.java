
	
	import java.util.Arrays;

	class PersonX implements Comparable<PersonX> {
	    private String name;
	    private int age;

	    public PersonX(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter and Setter methods

	    @Override
	    public int compareTo(PersonX otherPersonX) {
	        // Compare PersonXs based on their age
	        return Integer.compare(this.age, otherPersonX.age);
	    }

	    @Override
	    public String toString() {
	        return "PersonX{name='" + name + "', age=" + age + '}';
	    }
	}

	public class comparableexample {
	    public static void main(String[] args) {
	        // Create an array of PersonXs
	        PersonX[] PersonXs = {
	                new PersonX("John", 25),
	                new PersonX("Jane", 30),
	                new PersonX("Bob", 22)
	        };

	        // Sort the array using Arrays.sort (uses Comparable interface)
	        Arrays.sort(PersonXs);

	        // Display the sorted array
	        System.out.println("Sorted PersonXs:");
	        for (PersonX PersonX : PersonXs) {
	            System.out.println(PersonX);
	        }
	    }
	}

