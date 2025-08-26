package JavaPrograms;

public class Constructor2 {
int id;
String name;
String address;
Constructor2(){
	System.out.println("hello default const");
}
Constructor2(int a, String b, String c){
	this.id=a;
	this.name=b;
	this.address=c;	
	System.out.println(id + " "+name+ " " +address);
}
public void displayInfo() {
	System.out.println(id + " "+name+ " " +address);
}
public static void main(String[] args)
{
	Constructor2 c2=new Constructor2();
	Constructor2 c3=new Constructor2(12, "prem", "pune");
	c3.displayInfo();

}
}
