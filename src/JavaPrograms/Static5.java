package JavaPrograms;

public class Static5 {
	
	static int z=5;
	int y=1;
	public static void a()
	{
		z=20;
		System.out.println(z); 
	}	
	
	public void b() {
		
		z=15;
		System.out.println(z);
		a();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		Static5 s2=new Static5();
		s2.b();

	}

}
