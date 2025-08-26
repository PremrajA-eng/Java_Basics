package JavaPrograms;

public class trycatch {
		
		
	public static void main(String[] args) {
		int b=7;
		int c=0;
 try {
	   int a=b/0;
	//   int d[]=new [5];
     }
 
 catch(ArithmeticException et) {
	 System.out.println("arithmatic error");
 }
 
 catch(IndexOutOfBoundsException io) {
	 System.out.println("inex out of bound");
 }
 
catch(Exception e) {
	System.out.println("i catch the error");
}
 finally {
	 System.out.println("finally execute");
 }
		
	}

}
