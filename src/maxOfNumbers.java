import java.util.Scanner;

public class maxOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variables
        int[] array = new int[100];
        int index = 0;

        // prompt till EOF
        while (true) {
            System.out.println("Enter a number or press -1 to exit:");
            int number = input.nextInt();

            if (number != -1) {
                array[index] = number;
                index++;
            } else {
                break;
            }
        }
        int result = showArray(index, array);
        System.out.printf("Sum of the numbers is: %d", result);

    }

    // function array elements' sum
    public static int showArray(int index, int[] array) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += array[i];
        }
        return sum;
    }
}
