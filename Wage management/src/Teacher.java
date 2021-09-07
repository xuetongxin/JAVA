public class Teacher {
	private String position=null;
	private String dpartname=null;
	private int salary=0;
	Teacher(){}
	public void SetPosition(String position){
		this.position=position;
	}
	public String GetPosition() {
		return position;
	}
	public void SetDpartName(String dpartname) {
		this.dpartname=dpartname;
	}
	public String GetDpartName() {
		return dpartname;
	}
	public void SetSalary(int salary) {
		this.salary=salary;
	}
	public int GetSalary() {
		return salary;
	}
}
