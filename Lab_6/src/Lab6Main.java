
public class Lab6Main {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Alice Johnson", "1234567890", 3.8);
        Student student2 = new Student("Bob Smith", "6789012345", 3.2);
	 
        // Displaying student information
        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
        System.out.println();

        System.out.println("student1 failed CS111...oops");
        student1.setGPA(2.0);
        System.out.println(student1);

	
    }
}

