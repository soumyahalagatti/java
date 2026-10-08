package Homwork;


import java.util.Scanner;

class Employee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name = "";
        String designation = "";
        int age = 0;
        int salary = 0;
        int choice;

        do
        {
            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Sal");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:

                    do
                    {
                        System.out.print("Enter the name: ");
                        name = sc.next();

                        System.out.print("Enter the age: ");
                        age = sc.nextInt();

                        System.out.print("Enter the Designation (P20/M30/T25): ");
                        designation = sc.next();

                        if(designation.equalsIgnoreCase("P20"))
                        {
                            salary = 20000;
                        }
                        else if(designation.equalsIgnoreCase("M30"))
                        {
                            salary = 30000;
                        }
                        else if(designation.equalsIgnoreCase("T25"))
                        {
                            salary = 25000;
                        }
                        else
                        {
                            System.out.println("Wrong Designation");
                            salary = 0;
                        }

                        System.out.print("Do you want to continue? (y/n): ");
                        String ans = sc.next();

                        if(ans.equalsIgnoreCase("n"))
                        {
                            break;
                        }

                    } while(true);

                    break;

                case 2:

                    System.out.println("\nYour name is: " + name);
                    System.out.println("Your age is: " + age);
                    System.out.println("Your salary is: " + salary);
                    System.out.println("Your designation is: " + designation);

                    break;

                case 3:

                    salary = salary + 5000;

                    System.out.println("Salary Raised");
                    System.out.println("New salary is: " + salary);

                    break;

                case 4:

                    System.out.println("Exit");
                    break;

                default:

                    System.out.println("Wrong Choice");
            }

        } while(choice != 4);

        sc.close();
    }
}


