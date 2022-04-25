package oopjava;
import java.util.*;
 class rod1{
	 int r;
	rod1(int i){
		r=i;
	}
 }
 class rod2 extends rod1{
	 int h;
	rod2(int i,int j){
		super(i);
		h=j;
	}
 
	void volume() {
		double v;
		v=3.14*r*r*h;
		System.out.println("The volume of rod is "+v);
	}
 }
		
class rod{
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int a,b;
	 System.out.println("Enter radius");
	 a=sc.nextInt();
	 System.out.println("Enter height");
	 b=sc.nextInt();
	 rod2 obj=new rod2(a,b);
	 obj.volume();
 }
}
	
		
		
	


