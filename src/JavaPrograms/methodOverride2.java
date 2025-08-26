package JavaPrograms;

public class methodOverride2 extends methodOverride{
	public void eat() {
		System.out.println("eating 2");
		
	}
public static void main(String[] args) {
	methodOverride2 m1=new methodOverride2();
	m1.eat();
	methodOverride m2=new methodOverride();
	m2.eat();
}
}
