import java.util.Scanner;

public class HarshardNumber {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int totalSum = 0;
        int temp = x;

        while (temp > 0) {
            totalSum += temp % 10;
            temp /= 10;
        }

        if (x % totalSum == 0) {
            return totalSum;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        
        int result = sumOfTheDigitsOfHarshadNumber(input);
        
        if (result != -1) {
            System.out.println("It's a Harshad Number! Sum of digits: " + result);
        } else {
            System.out.println("Not a Harshad Number. Result: " + result);
        }
        
        scanner.close();
    }
}
