package JavaPrograms;

public class Array3 {

	
	static int c[] ={22, 2 ,44,5};
	public static void passingArraytoMethod() {
		int b=c[0]; //22
		for (int i=0;i<c.length;i++) {  // 0 < 4
			if (b>=c[i]) {   
				System.out.println(b);
			} else {
				System.out.println("ABCD");
			}
		}
		
	}
	
	public static void main(String[] args) {
		passingArraytoMethod();
	}

}
