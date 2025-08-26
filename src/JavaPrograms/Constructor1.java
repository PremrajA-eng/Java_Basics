package JavaPrograms;

public class Constructor1 {
	
Constructor1()
{
	System.out.println("default constrctor");
}

public Constructor1(String a, String b) {
	System.out.println(a +b);
	System.out.println(b);
}

public static void main(String[] args) {
	Constructor1 c1=new Constructor1();
	Constructor1 c2=new Constructor1("prem","raj");
}
}
