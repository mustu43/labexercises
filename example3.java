package javaexamples;
import java.util.*;
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String p1,p2;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your password");
 p1=sc.next();
 System.out.println("confirm your password");
 p2=sc.next();
	sc.close();
	if(p1.equals(p2)) {
		System.out.println("password match");
	} 
	else
	{
		System.out.println("password mismatch");
	}
	
	
	}

}
