package tools;
import java.util.Scanner;
public class MyPoint {
	 public  static  void  main(String[]  args)  {
         double  x,y;
         Scanner  in  =  new  Scanner(System.in);
         x  =  in.nextDouble();
         y  =  in.nextDouble();
         
         MyPoint  p1  =  new  MyPoint(x,y);

         x  =  in.nextDouble();
         y  =  in.nextDouble();                
         MyPoint  p2  =  new  MyPoint(x,y);        
         
         System.out.println(p1.distance(p2));                
         System.out.println(MyPoint.distance(p1,  p2));        
         System.out.println(p1.distance(x,y));
         
	 }
	 private  double x;
	 private  double y;
	 MyPoint(){
		 this.x=0;
		 this.y=0;
	 }
	 MyPoint(double x,double y){
		 this.x=x;
		 this.y=y;
	 }
	 public double getX() {
		 return x; 
	 }
	 public void setX(double x) {
		 this.x=x;
	 }
	 public double getY() {
		 return y;
	 }
	 public void setY(double y) {
		 this.y=y;
	 }
	 double distance(MyPoint p) {
		 double distance=0;
		 distance=Math.sqrt(Math.pow((p.getX()-x),2)+Math.pow((p.getY()-y),2));
		 return distance;
	 }
	 double distance(double x1,double y1) {
		 double distance=0;
		 distance=Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		 return distance;
	 }

	public static  double distance(MyPoint p1,MyPoint p2) {
		 double distance=0;
		 distance=Math.sqrt(Math.pow((p1.getX()-p2.getX()),2)+Math.pow((p1.getY()-p2.getY()), 2));
		 return distance;
	 }
}