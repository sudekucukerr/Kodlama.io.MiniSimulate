package entities;

public class Course {
	private int id;
	private String name;
	private double price;
	private String courseTime;
	
	public Course(int id, String name, double price, String courseTime){
		this.id = id;
		this.name = name;
		this.price = price;
		this.courseTime = courseTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	
	
	
}
