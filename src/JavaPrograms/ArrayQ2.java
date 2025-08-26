package JavaPrograms;

public class ArrayQ2 {
    public static void main(String[] args)
    {
			int a[][]= {{1,2,3,4},{5,6,0,9},{4,7,4,3}};
			int min=a[0][0];
			int j=0;
			int columnNum=0;
			for(int i=0;i<3;i++) { //row
				
				for( j=0;j<4;j++)   // column
				{
					if(a[i][j]<min) 
					{    // if(a[i][j]>max)
						
						min=a[i][j];
						columnNum=j;
					}														
				}
			}
			int max=a[0][columnNum];
			int k=0;
			while( k<3) {
				if (a[k][columnNum]>max) {
					max=a[k][columnNum];
				}
				k++;
			}
				System.out.println(min);		
			System.out.println(max);
	}}

//Find minimum number
// identify the column number
// find maximum number in the column
