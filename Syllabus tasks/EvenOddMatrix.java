import java.util.Scanner;

public class EvenOddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        int even = 0, odd = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }

        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);

        sc.close();
    }
}