package Abstract.java;

public class Stdparent {
	private int rollno;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private int m4;
	private int m5;

public void setdata(int r,String n,int a,int b,int c,int d,int e) {
	name = n;
	rollno = r;
	m1=a;
	m2=b;
	m3=c;
	m4=d;
	m5=e;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getM1() {
	return m1;
}

public void setM1(int m1) {
	this.m1 = m1;
}

public int getM2() {
	return m2;
}

public void setM2(int m2) {
	this.m2 = m2;
}

public int getM3() {
	return m3;
}

public void setM3(int m3) {
	this.m3 = m3;
}

public int getM4() {
	return m4;
}

public void setM4(int m4) {
	this.m4 = m4;
}

public int getM5() {
	return m5;
}

public void setM5(int m5) {
	this.m5 = m5;
}

public void show() {
	System.out.println("Name: " + name);
    System.out.println("rollno"+rollno);
}
}
