package lab2_19_08_25;
//Class Inheritance
class Animal {
  void sound() {
	  System.out.println("Animal makes a sound.");
  }
 }
class Dog extends Animal{
	void sound() {
		System.out.println("Dog Barks");
	}
	public static void main(String[] Args) {
		Dog d = new Dog();
		d.sound();  //Overridden
	}
}
