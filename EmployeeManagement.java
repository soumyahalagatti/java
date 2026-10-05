package sdfgd;

 import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        int age = 0;
        double salary = 0;

        while (true) {

            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    do {
                        System.out.print("Enter name: ");
                        name = sc.nextLine();

                        System.out.print("Enter age: ");
                        age = sc.nextInt();

                        System.out.print("Enter salary: ");
                        salary = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Continue? (yes/no): ");
                        String ans = sc.nextLine();

                        if (ans.equalsIgnoreCase("no"))
                            break;

                    } while (true);
                    break;

                case 2:
                    System.out.println("\nName: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Salary: " + salary);
                    break;

                case 3:
                    System.out.print("Enter salary increase: ");
                    double increase = sc.nextDouble();

                    salary = salary + increase;

                    System.out.println("New Salary: " + salary);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


