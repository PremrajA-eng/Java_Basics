package JavaPrograms;

public class methodOverriding11 extends methodOverriding10 {
	public void eat() 
	{
		System.out.println("class 11 eating");
	}
	
	public static void main(String[] arg) {
		methodOverriding11 m1=new methodOverriding11();
		m1.eat();
				
	}

}
