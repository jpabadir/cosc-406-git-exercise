public class Main {
    static int[] inputArray = { 1, 4, 5, 3, 5, 9, 8, 5 };

    public static void main(String[] args) {
        System.out.println(getSum(inputArray));
    }
    
    public static int getSum(int[] input) {
        int result = 0;
        for (int i : input) {
            result += i;
        }
        return result;
    }
}