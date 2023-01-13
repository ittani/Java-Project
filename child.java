package Assessment;

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
