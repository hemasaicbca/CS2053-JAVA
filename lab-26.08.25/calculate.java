package lab2_19_08_25;
import java.util.*;
public class calculate {
   public static void main(String[] args) {
	  if(args.length<2) {
		  System.out.println("Please provide two numbers as command line arguments ");
		  return;
	  }
	  int a = Integer.parseInt(args[0]);
	  int b = Integer.parseInt(args[1]);
	  System.out.println("Sum : "+(a+b));
   }
    
}
