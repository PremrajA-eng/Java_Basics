package JavaPrograms;

public class LogicalOpt {

	public static void main(String[] args) {
		int a=10;
		int b=23;
		int c=21;
		// logical opt = if first condition is false, 2nd condition will not check
		System.out.println(a>b && a<c); // false
		//  Bitwise operator will chcek both condition
		System.out.println(a<b & a<c);
		
		System.out.println(a>b&a++<c);
		System.out.println(a);
		
		System.out.println(a>b&&c++<b);
		System.out.println(c); 
		
	
	}

}
