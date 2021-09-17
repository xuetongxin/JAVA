package experiment;

public class Random {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double[] a=new double[100];
		for(double e:a) {
			e=Math.random()*10;
		}
		
		for(double e:a) {
			System.out.println(e);
		}
		
	}

}
