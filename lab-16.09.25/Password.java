package lab2_19_08_25;

import java.util.Scanner;

class WeakPasswordexception extends Exception{

	public WeakPasswordexception(String message) {

		super(message);

	}

}

public class Password {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a password");

		String pass= sc.nextLine();

		try {

			if(pass.length() < 6) {

				throw new WeakPasswordexception("Password too short! Must be atleast 6 characters");

			}

		}catch(WeakPasswordexception e) {

			System.out.println(e.getMessage());

		}

	}



}
