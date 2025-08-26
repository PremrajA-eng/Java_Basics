package JavaPrograms;

public class thisDemo {
    int a=4;  // class level variable.
	public void getData() {
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		
		thisDemo ss=new thisDemo();
		ss.getData();
		//System.out.println(a);
	}

}
