package Assessment;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
/*		// encapuslation part
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
	*/
		Scanner r= new Scanner(System.in);
//		child op= new child("MA","201604346",80.2,25900,25);
		child op= new child();
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
