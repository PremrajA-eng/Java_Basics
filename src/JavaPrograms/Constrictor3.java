package JavaPrograms;

public class Constrictor3 {
	 Constrictor3() {
		System.out.println("no parameter");
	}
	 Constrictor3(int a){
		System.out.println("integer parameter");
	}
	 Constrictor3(String b){
		 System.out.println("String parameter");
	 }
public static void main(String[] args) {
	Constrictor3 c3=new Constrictor3();
	Constrictor3 c4=new Constrictor3(20);
	Constrictor3 c5=new Constrictor3("prem");
}
}
