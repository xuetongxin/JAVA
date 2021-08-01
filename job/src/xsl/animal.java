package xsl;

public class animal {

	public static void main(String[] args) {
		Dog  dog=new  Dog(12,5);
        Cat  cat=new  Cat();
        cat.setAge(3);
        cat.setWeight(6);
        Bird  bird=new  Bird(1,2);
        dog.run();
        cat.run();
        cat.jump();
        bird.fly();
	}
}
class Cat {
	double weight=0;
	int age=0;
	Cat(){
	}
	Cat(double weight,int age){
		this.weight=weight;
		this.age=age;
	}
	
	double  getCat(){
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	int getAge() {
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void jump() {
		System.out.println("Cat jump...");
	}
	public void run() {
		System.out.println("Cat run...");
	}
}

class Bird {
	double weight;
	int age;
	Bird(){
	}
	Bird(double weight,int age){
		this.weight=weight;
		this.age=age;
	}
	
	double  getBird(){
		return weight;
	}
	public void setBird(double weight) {
		this.weight=weight;
	}
	int getAge() {
		return age;
	}
	public void setBird(int age){
		this.age=age;
	}
	public void fly() {
		System.out.println("Bird fly...");
	}
	
}

class Dog {
	double weight;
	int age;
	Dog(){
	}
	Dog(double weight,int age){
		this.weight=weight;
		this.age=age;
	}
	
	double  getDog(){
		return weight;
	}
	public void setDog(double weight) {
		this.weight=weight;
	}
	int getAge() {
		return age;
	}
	public void setDog(int age){
		this.age=age;
	}
    public void jump() {
		
	}
	public void run() {
		System.out.println("Dog run...");
	}
	
	
}