package twilvework;

public class AnimalTest {

	public static void main(String args[]) {
		MammalInt m = new MammalInt();
		m.eat(args[0]);
		m.travel(args[1]);
	}

}

class MammalInt {
	void eat(String args) {
		System.out.println(args);
	}

	void travel(String args) {
		System.out.println(args);
	}
}