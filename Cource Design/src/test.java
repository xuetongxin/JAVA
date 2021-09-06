import java.sql.SQLException;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		Drive drive=new Drive();
		
		System.out.println("===================");
		System.out.println("    学生管理系统");
		System.out.println("===================");
		System.out.println("1.学生信息录入");
		System.out.println("2.学生系统查询");
		System.out.println("3.学生系统修改");
		System.out.println("4.退出学生管理系统");
		System.out.println("===================");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		

		switch (choice) {
		case 1:
			do {
				
				System.out.print("input id:");
				double id = sc.nextDouble();
				System.out.print("input name:");
				String name = sc.next();
				System.out.print("input age:");
				int age = sc.nextInt();
				System.out.print("input grade:");
				String grade = sc.next();
				student.SetId(id);
				student.SetName(name);
				student.SetAge(age);
				student.SetGread(grade);

				drive.input_drive();
				System.out.println("if you want input information again? ture//false");
			} while (!sc.hasNextBoolean());
			break;
		case 2:
			drive.select_drive();
			break;
		case 3:
			do {
				System.out.print("input id:");
				double id = sc.nextDouble();
				System.out.print("input name:");
				String name = sc.next();
				System.out.print("input age:");
				int age = sc.nextInt();
				System.out.print("input grade:");
				String grade = sc.next();
				student.SetId(id);
				student.SetName(name);
				student.SetAge(age);
				student.SetGread(grade);
				
				drive.update_drive();
				
				System.out.println("if you want update information again? ture//false");
			}while(!sc.hasNextBoolean());
			break;
		case 4:
			break;

		}
		sc.close();
	}

}
