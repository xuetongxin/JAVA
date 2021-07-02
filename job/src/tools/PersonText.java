package tools;
import java.util.Scanner;
public class PersonText {

	public static void main(String[] args) {
		Person  p=new  Person();
        try (Scanner input = new  Scanner(System.in)) {
			System.out.print("enter  name:");                
			String  name=input.next();
			System.out.print("enter  age:");
			int  age=input.nextInt();
			p.setName(name);
			p.setAge(age);
		}
        p.speak();

	}
	
}
class Person{
	public String name;
    public int age;
	Person(){
	}
	String setName(String name) { 
		this.name=name;
		return this.name;
	}
	int setAge(int age) {
		this.age=age;
		return this.age;
	}
	public void speak() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}


