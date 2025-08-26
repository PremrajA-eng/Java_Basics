package JavaPrograms;

public class breakStatement2 {

	public static void main(String[] args) {
		for(int i=1;i<3;i++) {
			//innter loop 
			for(int j=1;j<3;j++) {
				if(i==2 && j==2) {
					break;
				}
				System.out.println(i+ " " +j);
			}
			System.out.println("control come out frm inner loop");	
		}
		System.out.println("system come out from outer loop");
		
	}

}
