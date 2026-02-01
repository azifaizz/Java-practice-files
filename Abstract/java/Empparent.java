package Abstract.java;

public class Empparent {
	private int id;
	private String name;
	private String dept;
	private int salary;
	public void setdataa(int i,String n,String d,int s) {
		id=i;
		name= n;
		dept = d;
		salary = s;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
		public void show() {
			System.out.println("Name: " + name);
		    System.out.println("id"+id);
	}	
	
}
