package JavaPrograms;

public class breakStatement3 {

	public static void main(String[] args) {
		int i=1; // local variable
		while(i<5) {
			if(i==3) {
				break;
			}
		System.out.println(i);
		i++;
		}
		System.out.println("out from Loop");
		
	}

}
