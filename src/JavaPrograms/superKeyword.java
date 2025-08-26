package JavaPrograms;

public class superKeyword  extends superkeyword2{

	String name="QA-Academy";
	
	public superKeyword() {
		super();
		System.out.println("its a child");
	}
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("i am child");
	}
	
	public static void main(String[] args) {
		superKeyword kd= new superKeyword();
		kd.getStringData();
		kd.getData();		
	}

}
