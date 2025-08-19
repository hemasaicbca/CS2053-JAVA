package lab2_19_08_25;

class Calculator {
   int add(int a,int b) {
	   return a + b;
   }
   int substract(int a,int b) {
	   return a-b;
   }
   public static void main(String[] args) {
	   Calculator calc = new Calculator();
	   System.out.println("Addition : " + calc.add(10, 5));
	   System.out.println("Substraction : " + calc.substract(10, 5));
   }
}
