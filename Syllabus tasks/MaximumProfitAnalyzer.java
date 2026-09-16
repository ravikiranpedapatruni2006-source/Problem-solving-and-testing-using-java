import java.util.Scanner;

public class MaximumProfitAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            currentSum += value;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);

        sc.close();
    }
}