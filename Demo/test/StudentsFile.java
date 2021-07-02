package test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentsFile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// 创建变量
		Student s1 = null;
		Student[] s2 = null;
		DataBasesBySet dataset = null;
		int n = 0;
		int[] age;
		String[] name;
		String[] sex = null;
		int ordinal[];
		String[] schoolname = null;
		File file = null;
		PrintWriter outprint = null;
		// 引用构建函数
		try {
			s1 = new Student(123, "zhangsan", 1);
			file = new File("Student.txt");
			outprint = new PrintWriter(file);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Enter the number of Students");
		n = sc.nextInt();
		s2 = new Student[n];
		age = new int[n];
		ordinal = new int[n];
		name = new String[n];
		sex = new String[n];
		schoolname = new String[n];

		for (int i = 0; i < s2.length; i++) {
			s2[i] = new Student();
		}
		// 从键盘输入学生数据
		try {

			System.out.print("please input students Datebase\n");
			for (int i = 0; i < n; i++) {
				System.out.print("ordinal:");
				ordinal[i] = sc.nextInt();
				s2[i].SetOrdinal(ordinal[i]);
				System.out.print("Age :");
				age[i] = sc.nextInt();
				s2[i].SetAge(age[i]);
				System.out.print("Name :");
				name[i] = sc.next();
				s2[i].SetName(name[i]);
				System.out.print("Sex :");
				sex[i] = sc.next();
				s2[i].SetSex(sex[i]);
				System.out.print("SchoolName :");
				schoolname[i] = sc.next();
				if (schoolname[i].matches("null")) {
					s2[i].SetSchoolName(s2[i].GetSchoolName());
				} else
					s2[i].SetSchoolName(schoolname[i]);
			}

			s1.print1();
			for (int i = 0; i < n; i++) {
				s2[i].print();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		outprint.println("Ordinal\t\tName\t\t\tAge\t\t\tSex");
		outprint.print(s1.GetOrdinal() + "\t\t\t");
		outprint.print(s1.GetName() + "\t\t");
		outprint.print(s1.GetAge() + "\t\t\t");
		outprint.println(s1.GetSex());
		for (int i = 0; i < s2.length; i++) {
			outprint.print(ordinal[i] + 1 + "\t\t\t");
			outprint.print(name[i] + "\t\t\t\t");
			outprint.print(age[i] + "\t\t\t");
			outprint.println(sex[i]);
		}

		try {
			System.out.println("if you want to output by the form of Set\nPlease type 'Yes' or 'yes' or 'No' or 'no'");
			String choice = sc.next();
			if (!choice.matches("Yes") || choice.matches(choice) || choice.contains("no") || choice.contains("No")) {
				System.out.println("please type your chioce again");
				choice = sc.next();
			}
			if (choice.matches("Yes") || choice.matches("yes")) {
				dataset = new DataBasesBySet(age, ordinal, name, sex);
				System.out.println(dataset.GetName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("over!!!");
		outprint.flush();
		sc.close();
		outprint.close();
	}

}

//创建学生类
class Student extends Teachers implements SameMethond {
	int age;
	String name;
	int ordinal;
	String sex;
	String schoolname = null;

	Student(int age, String name, int ordinal) {
		this.age = age;
		this.name = name;
		this.ordinal = ordinal;
	}

	Student(int ordinal, int age, String name, String sex) {
		super(ordinal, age, name, sex);
	}

	public Student() {
		// TODO 自动生成的构造函数存根
	}

	public int GetAge() {
		return age;
	}

	public void SetAge(int age) {
		this.age = age;
	}

	public String GetName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public int GetOrdinal() {
		return ordinal;
	}

	public void SetOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public void SetSex(String sex) {
		this.sex = sex;
	}

	public String GetSex() {
		return sex;
	}

	void SetSchoolName(String schoolname) {
		this.schoolname = schoolname;
	}

	String GetSchoolName() {
		return super.SchoolName;
	}

	void print1() {
		System.out.println(ordinal + " " + name + " " + age);
	}

	void print() {
		System.out.println(ordinal + " " + name + "  " + age + " " + sex + " " + schoolname);
	}

}

//创建老师类
class Teachers extends School {
	int ordinal;
	int age;
	String name;
	String sex;

	Teachers() {
	}

	Teachers(int ordinal, int age, String name, String sex) {
		this.ordinal = ordinal;
		this.name = name;
		this.sex = sex;
	}

	public int GetOrdinal() {
		return ordinal;
	}

	public void SetOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public String GetName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public String GetSex() {
		return sex;
	}

	public void SetSex(String sex) {
		this.sex = sex;
	}

	public void teacherfile() {
		System.out.print("i am the teacher" + GetName());
	}

	String GetSchoolName() {
		return super.GetSchoolName();
	}

}

abstract class School {
	String SchoolName = "孟津一高";

	void SetSchoolName(String SchoolName) {
		this.SchoolName = SchoolName;
	}

	String GetSchoolName() {
		return SchoolName;
	}

}

class DataBasesBySet {
	int[] age;
	int[] ordinal;
	String[] name;
	String[] sex;

	Set<Object> AgeofSet = new TreeSet<Object>();
	Set<String> Ordinaly0fSet = new TreeSet<String>();
	Set<String> NameofSet = new TreeSet<String>();
	Set<String> SexofSet = new TreeSet<String>();

	DataBasesBySet() {
	};

	DataBasesBySet(int[] age, int[] ordinal, String[] name, String[] sex) {
		this.age = age;
		this.ordinal = ordinal;
		this.name = name;
		this.sex = sex;
	}

	Set<Object> GetAge() {
		for (int i = 0; i < age.length; i++) {
			AgeofSet.add(age[i]);
		}
		return AgeofSet;
	}

	Set<String> GetName() {
		for (int i = 0; i < age.length; i++) {
			NameofSet.add(name[i]);
		}
		return NameofSet;
	}

}

//创建相同方法的接口
interface SameMethond {
	void SetAge(int age);

	int GetAge();

	void SetOrdinal(int oridinal);

	int GetOrdinal();

	void SetName(String name);

	String GetName();

	void SetSex(String sex);

	String GetSex();
}
