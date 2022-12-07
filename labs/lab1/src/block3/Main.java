package block3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = (int) (-100 + Math.random() * 200);
            }
        }

        for(int[] a : matrix){
            System.out.println(Arrays.toString(a));
        }

        int count = 0;
        int sum = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(matrix[i][j] > 0){
                    count++;
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }
}
