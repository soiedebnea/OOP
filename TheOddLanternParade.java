import java.util.Scanner;

public class TheOddLanternParade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        int count = 0;
        int number = 1;
        int sum = 0;
        
        System.out.println("First " + n + " odd numbers:");
        while (count < n) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
                sum += number;
                count++;
            }
            number++;
        }
        
        System.out.println("\nSum of first " + n + " odd numbers: " + sum);
        
        scanner.close();
    }
}