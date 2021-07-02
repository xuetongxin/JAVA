package tools;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		Student[] student=new Student[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<student.length;i++) {
			student[i]=new Student();
			String name=sc.next();
			student[i].setName(name);
			int age=sc.nextInt();
			student[i].setAge(age);
			int gender=sc.nextInt();
			student[i].setGender(gender);
			String phone=sc.next();
			student[i].setPhone(phone);
			String address=sc.next();
			student[i].setAddress(address);
			String emial=sc.next();
			student[i].setEmail(emial);
		}
		for(int i=0;i<student.length;i++) {
			System.out.println("find by email");             
            System.out.println("find by address");       
            System.out.println("exit");
            System.out.println("your choice:Enter name");
            String name=sc.next();
            String email=sc.next();
    		String address=sc.next();
            if(name.equals(student[i].getName())||email.equals(student[i].getEmail())||address.equals(student[i].getAddress()))
            	student[i].eat();
    			student[i].drink();
    			student[i].play();
    			student[i].sleep();
			}
		}
		
}
class  Student  {
	private  String  name;
    private  int  age;
    private  int  gender;
    private  String  phone;
    private  String  address;
    private  String  email;

    public  String  getName()  {
            return  name;
    }

    public  void  setName(String  name)  {
            this.name  =  name;
    }

    public  int  getAge()  {
            return  age;
    }

    public  void  setAge(int  age)  {
            this.age  =  age;
    }

    public  int  getGender()  {
            return  gender;
    }

    public  void  setGender(int  gender)  {
            this.gender  =  gender;
    }

    public  String  getPhone()  {
            return  phone;
    }

    public  void  setPhone(String  phone)  {
            this.phone  =  phone;
    }

    public  String  getAddress()  {
            return  address;
    }

    public  void  setAddress(String  address)  {
            this.address  =  address;
    }

    public  String  getEmail()  {
            return  email;
    }

    public  void  setEmail(String  email)  {
            this.email  =  email;
    }

    public  Student(String  name,  int  age,  int  gender,  String  phone,  String  address,  String  email)  {
            super();
            this.name  =  name;
            this.age  =  age;
            this.gender  =  gender;
            this.phone  =  phone;
            this.address  =  address;
            this.email  =  email;
    }

    public  Student()  {
            super();
            //  TODO  Auto-generated  constructor  stub
    }

    public  void  eat()  {
            System.out.println(name+"  eat...");
    }

    public  void  drink()  {
            System.out.println(name+"  drink...");
    }

    public  void  play()  {
            System.out.println(name+"  play...");
    }

    public  void  sleep()  {
            System.out.println(name+"  sleep...");
    }
}