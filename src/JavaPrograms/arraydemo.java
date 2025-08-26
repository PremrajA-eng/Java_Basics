package JavaPrograms;

public class arraydemo {

	public static void main(String[] args) {
	//	int a[]; // declare 
		int a[]= {1,2,3,4,5};
		int b[][]= {{1,2,3,4,5},{22,33,44,55,66}};
	    
		for(int k=0;k<b.length;k++) {
			
			for(int j=0; j<b[k].length;j++) {
				System.out.println(b[k][j]);
			}		
			
		}					
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
