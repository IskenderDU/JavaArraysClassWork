import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[in.nextInt()];

        int sum = 0;
        int avg = 0;
        int less = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            sum += numbers[i];
        }

        avg = (int) ((double) sum / numbers.length);
        System.out.println("Average: " + avg);

        System.out.print("Numbers less than or equal to average: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= avg) {
                less = numbers[i];
                System.out.print(less + " ");
            }
        }
    }
}