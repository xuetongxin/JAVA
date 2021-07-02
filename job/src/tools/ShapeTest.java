package tools;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Rectangle  r  =  new  Rectangle();
        System.out.println(r.area()+","+r.perimeter());
        //Circle  c  =  new  Circle();
       // System.out.println(c.area()+","+c.perimeter());         
        r  =  new  Rectangle(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        System.out.println(r.area()+","+r.perimeter());        
        
       // c  =  new  Circle(Double.parseDouble(args[2]));
        //System.out.println(c.area()+","+c.perimeter());        
        
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
	double x;
	double y;
	Rectangle(){
       }
	Rectangle(double parseDouble, double parseDouble1) {
		x=parseDouble;
		y=parseDouble1;
	}
	double getx() {
		return x;
	}
	double gety() {
		return y;
	}
	double area() {
	double areas;
	return areas=getx()*gety();
	}
	double perimeter() {
		double per;
		return per=2*getx()*gety();
	}
class Circle extends Shapes{
		double r;
		Circle(){
			
		}
		public Circle(double parseDouble3) {
			r=parseDouble3;
		}
		double area() {
			double areas;
			return areas=Math.PI *r*r;
		}
		double perimeter() {
			double per;
			return per=2*r*Math.PI;
		}
	}
       
}
