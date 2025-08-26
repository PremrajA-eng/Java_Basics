package JavaPrograms;

public class Static3 {

	int roll;
	String name;
	static String college="iit bombay ";
	//public static void main(String[] args) {
		// constructor
		Static3(int r, String n)
		{
			roll=r;
			name=n;
		
			
		}
		public void getResult()
		{
			System.out.println(roll+" "+name+" "+college);
		}
 
	}


