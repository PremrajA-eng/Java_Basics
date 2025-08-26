package JavaPrograms;

public class Array1 {

	public static void main(String[] args) {
		// declairing the array
		int a []=new int [5];
		System.out.println(a.length);
		System.out.println(a[0]);
		// proint default value of an array.
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		// Assigning value to an array
		 a[0]=65;
		a[1]=99;
		a[2]=10;
		a[3]=23;
		a[4]=50;
		for (int j=0; j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
