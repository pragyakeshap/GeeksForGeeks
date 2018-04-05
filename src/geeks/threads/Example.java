package geeks.threads;

class Base {
    protected int i;

	Base() {
		add(1);
	}

	int add(int v) {
		System.out.println("Base add");
		i += v;
		System.out.println("i in base "+i);
		return i;
	}
}

class Extension extends Base {
	Extension() {
		add(1);
	}

	int add(int v) {
		System.out.println("Extension add");
		i += v * 2;
		System.out.println("i in Extension "+i);
		
		return i;
	}
}

public class Example {
	public static void main(String[] args) {
		System.out.println(" " + bogo(new Extension()));
	}

	static int bogo(Base b) {
		return b.add(8);
	}
}