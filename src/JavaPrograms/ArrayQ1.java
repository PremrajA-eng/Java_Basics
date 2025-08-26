package JavaPrograms;

public class ArrayQ1 {

	public static void main(String[] args) {
    
			int a[][]= {{1,2,3,4},{5,6,8,9},{4,7,4,0}};
			int min=a[0][0];
						
			for(int i=0;i<3;i++) { //row
				
				for(int j=0;j<4;j++)   // column
				{
					if(a[i][j]<min) {    // if(a[i][j]>max)
						
						min=a[i][j];
					}														
				}
			}
			System.out.println(min);
	}

}
