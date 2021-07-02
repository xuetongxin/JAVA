package fifth;
public class ShapeText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Rectangle  r  =  new  Rectangle();
        System.out.println(r.area()+","+r.perimeter());
        Circle  c  =  new  Circle();
        System.out.println(c.area()+","+c.perimeter());        
        
        Shapes  s  =  r;
        s  =  c;
         
        r  =  new  Rectangle(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        System.out.println(r.area()+","+r.perimeter());        
        
        c  =  new  Circle(Double.parseDouble(args[2]));
        System.out.println(c.area()+","+c.perimeter());        
        
	}

}
class  Shapes{
    double  area()  {
            return  0;
    }
    
    double  perimeter()  {
            return  0;
    }
}
class Rectangle extends Shapes{
	double x=1;
	double y=1;
	Rectangle(){
       }
	public Rectangle(double parseDouble, double parseDouble1) {
		this.x=parseDouble;
		this.y=parseDouble1;
	}
	double  area()  {
        return  x*y;
	}

	double  perimeter()  {
        return  2*(x+y);
	}
}
class Circle extends Shapes{
		double r=1;
		Circle(){	
		}
		public Circle(double parseDouble3) {
			this.r=parseDouble3;
		}
		double area() {
			return Math.PI *r*r;
		}
		double perimeter() {
			return 2*r*Math.PI;
		}
	}
