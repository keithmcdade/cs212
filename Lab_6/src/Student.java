
public class Student {
	
	private String name, id;
	private Double gpa;
	
	// default constructor
	public Student() {
		name = null;
		id = null;
		gpa = null;
	}
	
	// parameterized constructor
	public Student(String name, String id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	// getters
	public String getName() { return name; }
	public String getID() { return id; }
	public double getGPA() { return gpa; }
	
	// setters
	public void setName(String name) { this.name = name; }
	public void setID(String id) { this.id = id; }
	public void setGPA(double gpa) { this.gpa = gpa; }

	// returns true if student GPA > 3.5 else false
	public boolean isOnHonorRoll() {
		return (gpa >= 3.5);
	}
	
	// overrides toString, returns student info as String
	public String toString() {
		return  "Name:   " + this.name + "\n" +
				"ID:     " + this.id + "\n" +
				"GPA:    " + this.gpa + "\n" +
				"Honors: " + (this.isOnHonorRoll());
	}
	
}
