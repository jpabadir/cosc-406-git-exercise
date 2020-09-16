public class Main {
    static int[] inputArray = { 1, 4, 5, 3, 5, 9, 8, 5 };

    public static void main(String[] args) {
        System.out.println("Sum of all integers in array is: " + getSum(inputArray));
        System.out.println("Product of all integers in array is: " + getProduct(inputArray));
    }

    // This method gets the sum of all integers in array
    public static int getSum(int[] input) {
        int result = 0;
        for (int i : input) {
            result += i;
        }
        return result;
    }

    public static int getProduct(int[] input) {
        int result = 0;
        if (input.length >= 1) {
            result = input[0];
            for (int i = 1; i < input.length; i++) {
                result *= input[i];
            }
        }
        return result;
    }
}