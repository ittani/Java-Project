# Java Inheritance
package Assessment;
import java.util.*;
public class ParentK {
private String initials,studentId;
private double grades, fees;

public ParentK(String initials, String studentId, double grades, double fees)
{
	this.fees=fees;
	this.grades=grades;
	this.initials=initials;
	this.studentId=studentId;
}
public ParentK()
{}

public void setGrade(double gr){grades= gr;}
public void setFees(double f) {fees=f;}
public void setInitials(String in) {initials=in;}
public void setStudentId(String st) {studentId=st;}

public double getGrade() {return grades;}
public double getFees() {return fees;}
public String getInitials() {return initials;}
public String getStudentId() {return studentId;}

}
public class child extends ParentK{
	private int age;
	public child(String initials, String studentId, double grades, double fees,int age)
	{
		super(initials,studentId,grades,fees);
		this.age=age;
		
	}
	public child() {}
	
	public void setAge(int g) {age=g;}
	public int getAge() {return age;}
	
	
	

}
public class Main1 {

	public static void main(String[] args) {
		// encapuslation part
		encap val=new encap("Ittani",25000,25);
      System.out.println("name is " + val.getName());
      System.out.println("Salary is " + val.getSalary());
      System.out.println("Age is " + val.getAge());
      //encapuslation from default constructore
    
      val.setAge(23);
		val.setName("Skepe");
      val.setSalary(55000);
      System.out.println("\nname is " + val.getName());
      System.out.println("Salary is " + val.getSalary());
      System.out.println("Age is " + val.getAge());
//   Area part
      Area pal= new Area();
      pal.setHeight(0.89);
      pal.setLength(0.23);
      System.out.println("\n" + "Area="+pal.getArea()+"mm^2");
      // Polymorphism
      polymorphs del = new polymorphs();
      System.out.println("\nTwo Subtraction "+ del.add(15, -8));
      System.out.println("Three Additions "+ del.add(15, 15, 15));
      //Costruction Overloading
      Box mybox1= new Box(20.2,40.5,62.2);
      Box mybox2= new Box();
      Box circle= new Box(44.2);
      
     System.out.println("Box 1 volume="+mybox1.vol()+" mm^2");
     System.out.println("Box 2 volume="+mybox2.vol()+" mm^2");
     System.out.println("Box 3 Cycle volume="+circle.vol()+" mm^2");
	
		Scanner r= new Scanner(System.in);
	child op= new child("MA","201604346",80.2,25900,25);
		child op1= new child();
		String in,student;
		double grad, fee;
		int ag;
		
		System.out.println("Enter new student information");
		System.out.println("initials");
		in=r.next();
		System.out.println("student number");
		student=r.next();
		System.out.println("Student Fees");
		fee=r.nextDouble();
		System.out.println("Grades");
		grad=r.nextDouble();
		System.out.println("Student age");
		ag=r.nextInt();
		
		op.setInitials(in);
		op.setStudentId(student);
		op.setAge(ag);
		op.setGrade(grad);
		op.setFees(fee);
		System.out.println("\nInitials="+op.getInitials()+"\nStudentId="+op.getStudentId()+"\nStudent Grades="+op.getGrade()
		+"\nStudent Fees R="+op.getFees()+"\nStudent is "+op.getAge()+" years old");
	}

}

# Encapsulation

public class encap {

	private String name;
	private double salary;
	private int age;
	//constructor
	encap(String name, double salary, int age)
	{
this.age=age;
this.name=name;
this.salary=salary;
	}
	//default constructor
	encap()
	{}
	
	//get Methods
	public String getName() {return name;}
	public double getSalary() {return salary;}
	public int getAge() {return age;}
	
	//set Methods
	public void setName(String nam) {name=nam;}
	public void setSalary(double sal) {salary=sal;}
	public void setAge(int age1) {age=age1;}

}
public class Main {

	public static void main(String[] args) {
		// encapuslation part
		encap val=new encap("Ittani",25000,25);
      System.out.println("name is " + val.getName());
      System.out.println("Salary is " + val.getSalary());
      System.out.println("Age is " + val.getAge());
      //encapuslation from default constructore
    
      val.setAge(23);
		val.setName("Skepe");
      val.setSalary(55000);
      System.out.println("\nname is " + val.getName());
      System.out.println("Salary is " + val.getSalary());
      System.out.println("Age is " + val.getAge());
  }
}

# BufferReader, FileReader and FileWriter
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class BufferReader {

	public static void main(String[] args) {
	
		char[] arr= new char[5];
		String data="Ittani is eating";
	
		try {
			FileReader file= new FileReader("input.txt");
			BufferedReader input= new BufferedReader(file);
			FileWriter fil= new FileWriter("input.txt");
			//Skips 5 characters
			input.skip(5);
			//Read in characters
			input.read(arr);
			//writing the string to the file
			fil.write(data);
			System.out.println("Data in the file");
			System.out.println(arr);
			//closing the reader
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
