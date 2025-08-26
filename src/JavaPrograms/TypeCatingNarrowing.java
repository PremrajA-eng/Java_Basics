package JavaPrograms;

public class TypeCatingNarrowing {

	public static void main(String[] args) {
		double b=5.6;
		int a=(int)b; // manual casting to int
		System.out.println(b);
		System.out.println(a);
		
		//String to Integer conversion
		String s="23";
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		// Integer to string conversion
		int z=5;
		String t=String.valueOf(z);
		System.out.println(t.length()); //5
		System.out.println(t); //1
	}
	

}
