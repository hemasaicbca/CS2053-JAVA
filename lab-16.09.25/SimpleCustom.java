package lab2_19_08_25;

import java.util.Scanner;

class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {

		super(message);

	}

}

public class SimpleCustom {

  public static void main(String [] args) {

	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter age");

	  int age = sc.nextInt();

	  try {

		  if(age<5 || age>18) {

			  throw new InvalidAgeException("Age must be between 5 and 18");

			  

		  }

		  System.out.println(age);

		  

	  }catch(InvalidAgeException e) {

		  System.out.println("Error"+e.getMessage());

	  }

			  

  }

}