import java.util.Scanner;

public class stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int loopCount;
        System.out.print("Enter the number of stars of layers: ");
        loopCount = input.nextInt();

        int spaceCount = loopCount - 1;

        if (loopCount < 1) {
            System.out.println("Invalid number of stars!");
        } else {
            String star = "*";
            for (int i = 1; i <= loopCount; i++) {
                spaceCount -= 1;
                for (int j = 0; j <= spaceCount; j++) {
                    System.out.print(" ");
                }
                System.out.println(star);
                star = star + "**";
            }
        }
    }
}
