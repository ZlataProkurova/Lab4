import java.util.Scanner;
public class Lab4  { public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    int array[], arraySize = 0;

    System.out.print("Enter the dimension of the array: ");
    while (!in.hasNextInt()) {
        System.out.println("Error! The dimension of the array must be a number.");
        System.out.print("Enter the dimension of the array: ");
        in.next();
    }
    arraySize = in.nextInt();

    array = new int[arraySize];
    int count_x = 0;
    for (int i = 0; i < array.length; i++) {
        System.out.print("Enter " + i + " element of the array: ");
        while (!in.hasNextInt()) {
            System.out.println("Error!The element must be a number!");
            System.out.print("Enter " + i + " element of the array: ");
            in.next();
        }
        array[i] = in.nextInt();
    }

    System.out.print("Enter the value you want to exclude: ");
    while (!in.hasNextInt()) {
        System.out.println("Error! The value must be a number!");
        System.out.print("Enter the value you want to exclude: ");
        in.next();
    }
    int X = in.nextInt();

    System.out.print("Array before excluding all elements " + X + ": ");
    for (int elem : array) {
        System.out.print(elem + " ");
        if (elem == X) {
            count_x++;
        }
    }
    System.out.println();

    int[] copy = new int[array.length - count_x];
    int index = 0;

    for (int i = 0; i < array.length; i++) {
        if (array[i] != X) {
            copy[index] = array[i];
            index++;
        }
    }

    System.out.print("Array after excluding all elements " + X + ": ");
    for (int elem : copy)
        System.out.print(elem + " ");
    System.out.println();

    in.close();
}
}







