package JavaPrograms;

public class Encapsulation {
String name; // global variable
int b; // global variable.
final int c=2; // final variable
public void a () {
	//c=4;  final variable can not change the value.
}
final void d() {
	System.out.println("final method");
}
public void setName(String s) {
	this.name=s;
	this.b=5;
	System.out.println(b);
	System.out.println(c);
}
	public String getName() {
		return name;
	}
}
