package lab2_19_08_25;

import java.util.Scanner;

class UnderAgeException extends Exception {

	public UnderAgeException(String message) {

		super(message);

	}

}

public class UnderAge {

	public static void main(String [] args) {

 Scanner sc = new Scanner(System.in);

 System.out.println("Enter your age");

  int age = sc.nextInt();

  try{

	  if(age<18) {

		  throw new UnderAgeException("you must be atleast 18 years old");

	  }

	  System.out.println(age);

	  

  }catch(UnderAgeException e )

  {

	 System.out.println(e.getMessage());

  }

  

		 

}

}

