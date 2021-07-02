package git;

public class SeverTest {
	public static void main(String[] args) {
		Object[] objects = { new teacher(), new docter(), new police(), new soldier(), new others() };
		for (int i = 0; i < objects.length; i++) {
			System.out.println(((SeverThePeople) objects[i]).Sever());
		}
	}
}

interface SeverThePeople {
	public String Sever();
}

class teacher implements SeverThePeople {
	teacher() {
	}

	public String Sever() {
		return "Preach,Knowledge,Dispels doubt.";
	}
}

class docter implements SeverThePeople {
	public String Sever() {
		return "heal the wounded and rescue the dying.";
	}
}

class police implements SeverThePeople {
	public String Sever() {
		return "uphold the rule of law.";
	}
}

class soldier implements SeverThePeople {
	public String Sever() {
		return "protect our homes and defend our country.";
	}
}

class others implements SeverThePeople {
	public String Sever() {
		return "Do your job.";
	}
}
