package xsl;
import java.util.Scanner;
public class Complex {
	double real;
	double image;
	
	Complex(){
		Scanner input =new Scanner(System.in);
		double real=input.nextDouble();
		double image=input.nextDouble();
		Complex(real,image);		
	}
	private void Complex(double real,double image) {
		this.real=real;
		this.image=image;
	}
	Complex(double real,double image){
		this.real=real;
		this.image=image;
	}
	
	
	public double getReal() {
		return real;
	}
	public void setReal() {
		this.real=real;
	}
	public double getImage() {
		return image;
	}
	public void setImage() {
		this.image=image;
	}
	Complex add(Complex a) {
		double real2=a.getReal();
		double image2=a.getImage();
		double newReal=real+real2;
		double newImage=image+image2;
		Complex result=new Complex(newReal,newImage);
		return result;
	}
	
	Complex sub(Complex a) {
		double real2=a.getReal();
		double image2=a.getImage();
		double newReal=real-real2;
		double newImage=image-image2;
		Complex result=new Complex(newReal,newImage);
		return result;
	}
	
	Complex mul(Complex a) {
		double real2=a.getReal();
		double image2=a.getImage();
		double newReal=real*real2-image*image2;
		double newImage=image*real2+real*image2;
		Complex result=new Complex(newReal,newImage);
		return result;
	}
	public void print() {
		if(image>0)
			System.out.println(real+"+"+image+"i");
		else if(image<0)
			System.out.println(real+""+image+"i");
		else
			System.out.println(real);
	}
	

}
