package javafullstack;

public class Construct {

	 String name;
	 Construct(String n){
	  name =n;
	 }
	 
	 Construct()
	 {
	  System.out.print("im defaut constructor");
	 }
	 
	 public static void main (String [] args) {
	  Construct s1 = new Construct("ram charan");
	  System.out.println(s1.name);
	  Construct  s = new Construct();
	  
	 }
	}

