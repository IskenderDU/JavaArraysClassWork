import java.util.Arrays;

public class Task2 {
    public static int even(int[] arr) {
        int even = 0;

        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static int odd(int[] arr) {
        int odd = 0;

        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];

        System.out.print("Array values:" + " ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Even numbers:" + " " + even(numbers));
        System.out.println("Odd numbers:" + " " + odd(numbers));
    }

}
