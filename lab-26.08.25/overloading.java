package lab2_19_08_25;
import java.util.*;

class calc {  
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}

public class overloading {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter two doubles: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        calc m = new calc();

        System.out.println("Sum of integers: " + m.sum(a, b));
        System.out.println("Sum of doubles: " + m.sum(x, y));
    }
}
