package fifth;

public class JiChengTtest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			String name = args[0];
			String id = args[1];
			String name1 = args[2];
			String id1 = args[3];
			Animal a1 = new Penguin(name, Integer.parseInt(id));
			Animal a2 = new Mouse(name1, Integer.parseInt(id1));

			a1.eat();
			((Penguin) a1).sleep();
			a1.introduction();
			a2.eat();
			a2.sleep();
			((Mouse) a2).introduction();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
	class Animal {
		protected String name;
		protected int id;

		public Animal(String myName, int myid) {
			name = myName;
			id = myid;
		}

		public void eat() {
			System.out.println(name + "  eating,Animal");
		}

		public void sleep() {
			System.out.println(name + "  sleeping,Animal");
		}

		public void introduction() {
			System.out.println("Animal said hello,my id is " + id + ",name is " + name + ".");
		}
	}

	class Penguin extends Animal {
		public Penguin(String name, int parseInt) {
			super(name, parseInt);
			this.name = name;
			this.id = parseInt;
		}

		public void eat() {
			System.out.println(name + " eating,Animal");
			System.out.println(name + " eating,Penguin");
		}

		public void sleep() {
			System.out.println(name + " sleeping,Penguin");
		}

		public void introduction() {
			System.out.println("Penguin said hello,my id is " + id + ",name is " + name + ".");
		}
	}

class Mouse extends Animal {
	public Mouse(String name, int pareInt) {
		super(name, pareInt);
		this.name = name;
		this.id = pareInt;
	}

	public void eat() {
		System.out.println(name + " eating,Animal");
		System.out.println(name + " eating,Mouse");
	}

	public void sleep() {
		System.out.println(name + " sleeping,Mouse");
	}

	public void introduction() {
		System.out.println("Mouse said hello,my id is " + id + ",name is " + name + ".");
	}
}
