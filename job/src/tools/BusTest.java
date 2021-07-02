package tools;

public class BusTest {
	public  static  void  main(String[]  args)  {
        Bus  bus=new  Bus();
        System.out.println(bus.m);
        bus.start();
        bus.speedUp(60);
        bus.stop();
        bus.gotOn(10);
        bus.gotOff(5);
}
}
class Auto {
	int m;
	double speed=0;
	boolean on=false;
	Auto(){
		System.out.println("A");
		
	}
	/*public Auto(int m){
		this.m=m;
	}*/
	void start(){
		on=true;
		System.out.println("The auto is started.");
	}
	void speedUp(double speed) {
		if(on==true) {
			this.speed=speed;
		}
		System.out.println("The auto is speed up to "+this.speed+"kilo/h.");
	}
	void stop() {
		on=false;
		System.out.println("The auto is stopped.");
	}
	
}
class Bus extends Auto{
	Bus(){
		System.out.println("B");
		m=m+1;
	}
	int passage=0;
	void gotOff(int num) {
		passage-=num;
		System.out.println("The person on bus is: "+passage);
	}
	void gotOn(int num) {
		passage+=num;
		System.out.println("The person on bus is: "+passage);
	}
}


