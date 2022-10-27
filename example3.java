package javaexamples;
import java.util.*;
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String pass1,pass2;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your password");
 pass1=sc.next();
 System.out.println("confirm your password");
 pass2=sc.next();
	sc.close();
	if(pass1.equals(pass2)) {
		System.out.println("Allow");
	} 
	else
	{
		System.out.println("password mismatch");
	}
	
	
	}

}
