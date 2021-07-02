package git;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StudentsFile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//创建变量
		Student s1 = null;
		Student s2 = null;
		Fileoutput Fot = null;
		int age = 0;
		String name = null;
		int number = 0;
		boolean bool = true;
		File file = null;
		FileOutputStream output = null;
		BufferedOutputStream outDate = null;
		//引用构建函数
		try {
			s1 = new Student(123, "zhangsan", 1);
			s2 = new Student();
			file = new File("Student.txt");
			output = new FileOutputStream(file);
			outDate = new BufferedOutputStream(output);
			Fot = new Fileoutput(file);
		} catch (Exception e) {
			System.out.println(e);

		}
		//从键盘输入学生数据
		do {
			try {
				System.out.print("please input students Datebase\nAge:");
				age = sc.nextInt();
				System.out.print("Number:");
				number = sc.nextInt();
				System.out.print("Name:");
				name = sc.next();
				bool = false;

				Fot.setname(name);
				Fot.write(file);
			} catch (Exception e) {
				System.out.println(e);

				System.out.print("please follow the sort: \nFirst: age\nSecond: number\nThird: name\n");
			}
		} while (bool);
		//将学生信息写道文档里面
		byte[] date = name.getBytes();
		outDate.write(age);
		outDate.write(date);
		outDate.write(number);

		s2.setage(age);
		s2.setname(name);
		s2.setnumber(number);
		s1.print();
		s2.print();
		sc.close();
		output.close();
		// outDate.close();
	}

}
//创建学生类
class Student extends Teachers {
	int age;
	String name;
	int number;
	Teachers t1 = new Teachers();

	Student() {
	}

	Student(int age, String name, int number) {
		this.age = age;
		this.name = name;
		this.number = number;
	}

	int getage() {
		return age;
	}

	void setage(int age) {
		this.age = age;
	}

	String getname() {
		return name;
	}

	void setname(String name) {
		this.name = name;
	}

	int getnumber() {
		return number;
	}

	void setnumber(int number) {
		this.number = number;
	}

	void print() {
		System.out.println(age + " " + name + "  " + number);
	}

}
//创建老师类
class Teachers {
	int number;
	String name;
	String sex;

	Teachers() {
	}

	Teachers(int number, String name, String sex) {
		this.number = number;
		this.name = name;
		this.sex = sex;
	}

	int getnumber() {
		return number;
	}

	void setnumbr(int number) {
		this.number = number;
	}

	String getname() {
		return name;
	}

	void setname(String name) {
		this.name = name;
	}

	String getsex() {
		return sex;
	}

	void setsex(String sex) {
		this.sex = sex;
	}

	void teacherfile() {
		System.out.print("i am the teacher" + getname());
	}
}
//构建一个文件输入类，对文件进行处理
class Fileoutput {
	File file = null;
	BufferedOutputStream Bfile = null;
	byte[] Byte = null;
	String name = null;

	Fileoutput() {
	}

	Fileoutput(File file) {
		this.file = file;
	}

	Fileoutput(BufferedOutputStream Bfile) {
		this.Bfile = Bfile;
	}

	String getname() {
		return name;
	}

	void setname(String name) {
		this.name = name;
	}

	File write(File file) throws Exception {
		FileOutputStream out;

		try {
			out = new FileOutputStream(file);

			out.write(names());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return file;
	}

	byte[] names() {
		Byte = name.getBytes();
		return Byte;
	}

}
