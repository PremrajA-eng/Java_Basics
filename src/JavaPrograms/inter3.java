package JavaPrograms;

public class inter3 extends Interface2 implements inter1,interf2 {

	@Override
	public void A() {
		System.out.println("A method");
		
	}
	public static void main(String[] args) {
	 inter3 i3=new inter3();
	 i3.A();
	}

}
