package Assessment;

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
