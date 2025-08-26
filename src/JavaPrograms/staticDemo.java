package JavaPrograms;

public class staticDemo {
        String name;  // instance variable
        String address;
   static String city="rithad"; // class variable
   static int a=0;
   
   // static block
   static {
	   int d=4;
	   String jadu="asdad";
   }
        
        staticDemo(String name,String address)
        {
        	this.name=name;
        	this.address=address;
        //	this.city=city;
        	a++;
        	System.out.println(a);
        	
        }
        public void m1() {
        	System.out.println(address+" "+city);
        }
        
        public static void getCity() {
        	System.out.println(city);
        }
        
	public static void main(String[] args) {
		
		staticDemo st= new staticDemo("washim","rithad");
		staticDemo st2= new staticDemo("nagpur","jambhora");
		st.m1();
		st2.m1();
		System.out.println(city);
		
		staticDemo.getCity();   //static methods directly call by using class name 
	}

}
