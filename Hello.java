package Homework;

public class Hello {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.println("Array elements:");

            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array Index Out of Bounds!");
        }

        System.out.println("Program continues normally.");
    }
}


