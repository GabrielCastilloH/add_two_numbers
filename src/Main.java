import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;

        System.out.println("Enter a binary number: ");
        Scanner numberInput = new Scanner(System.in);
        firstNum = Integer.parseInt(numberInput.nextLine());

        System.out.println("Enter a binary number: ");
        Scanner secNumInput = new Scanner(System.in);
        secondNum = Integer.parseInt(numberInput.nextLine());

        int finalNum = firstNum + secondNum;

        System.out.println("Numbers you entered: " + firstNum + ", " + secondNum);
        System.out.println("Sum: " + finalNum);
    }
}
