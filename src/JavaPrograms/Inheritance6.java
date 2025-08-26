package JavaPrograms;

public class Inheritance6 extends Inheritance0 {

	public void add(int x, int y) {
		z = x + y;
		System.out.println("sum is:" + z);

	}

	public static void main(String[] args) {
		int x = 10, y = 20;
		Inheritance6 i4 = new Inheritance6();
		i4.add(x, y);
		i4.sub(x, y);

	}

}
