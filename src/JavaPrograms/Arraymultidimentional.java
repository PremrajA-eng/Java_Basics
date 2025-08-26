package JavaPrograms;

public class Arraymultidimentional {

	public static void main(String[] args) {
		int a[][]= new int[2][3];
		a[0][0]=4;
		a[0][1]=43;
		a[0][2]=443;
		a[1][0]=433;
		a[1][1]=434;
		a[1][2]=46;
		
		for(int i=0; i<2;i++) {
			
			for(int j=0; j<3;j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
