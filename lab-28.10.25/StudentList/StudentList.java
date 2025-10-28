package lab2_19_08_25;

import java.util.*;



public class StudentList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        int choice;



        do {

            System.out.println("\n--- Student List Menu ---");

            System.out.println("1. Add Student");

            System.out.println("2. Insert Student at Index");

            System.out.println("3. Update Student Name");

            System.out.println("4. Remove Student (by name or index)");

            System.out.println("5. Display Students");

            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            sc.nextLine(); // consume newline



            if (choice == 1) {

                System.out.print("Enter student name: ");

                String name = sc.nextLine();

                students.add(name);

                System.out.println("Student added.");



            } else if (choice == 2) {

                System.out.print("Enter index: ");

                int index = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter student name: ");

                String name = sc.nextLine();

                if (index >= 0 && index <= students.size()) {

                    students.add(index, name);

                    System.out.println("Student inserted.");

                } else {

                    System.out.println("Invalid index!");

                }



            } else if (choice == 3) {

                System.out.print("Enter index to update: ");

                int index = sc.nextInt();

                sc.nextLine();

                if (index >= 0 && index < students.size()) {

                    System.out.print("Enter new name: ");

                    String newName = sc.nextLine();

                    students.set(index, newName);

                    System.out.println("Student updated.");

                } else {

                    System.out.println("Invalid index!");

                }



            } else if (choice == 4) {

                System.out.println("Remove by: 1. Name  2. Index");

                int option = sc.nextInt();

                sc.nextLine();

                if (option == 1) {

                    System.out.print("Enter name to remove: ");

                    String name = sc.nextLine();

                    if (students.remove(name)) {

                        System.out.println("Student removed.");

                    } else {

                        System.out.println("Name not found.");

                    }

                } else if (option == 2) {

                    System.out.print("Enter index to remove: ");

                    int index = sc.nextInt();

                    if (index >= 0 && index < students.size()) {

                        students.remove(index);

                        System.out.println("Student removed.");

                    } else {

                        System.out.println("Invalid index!");

                    }

                }



            } else if (choice == 5) {

                System.out.println("\n--- Student List ---");

                if (students.isEmpty()) {

                    System.out.println("No students in the list.");

                } else {

                    for (int i = 0; i < students.size(); i++) {

                        System.out.println(i + ": " + students.get(i));

                    }

                }

            }



        } while (choice != 0);



        System.out.println("Exiting program...");

        sc.close();

    }

}
