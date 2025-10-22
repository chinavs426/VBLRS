package javafullstack;


	//Constructors in Inheritance
	class A{
	 int i;
	 int j;
	 A(){} //default constructor
	 A(int i, int j){ //parametrized constructor
	  this.i= i;
	  this.j= j;
	 }
	 void display(){
	  System.out.println("i= "+i+" j= "+j); 
	 }
	}
	class B extends A{
	 int k;
	 B(int k){
	  this.k=k;
	 }
	 void display(){
	  super.display();
	  System.out.println("k = "+k);
	 }
	}
	class De1{
	 public static void main(String args[]){
	  A a = new A(10,20); //a.i=0 b.j=0
	  a.display();// i=10 j=20
	  B b = new B(50);//b.i=0 b.j=0 b.k=30
	  b.display();//i=0   j=0  k=30
	 }
	}

