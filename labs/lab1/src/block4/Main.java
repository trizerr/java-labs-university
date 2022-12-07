package block4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = (int) (10 + Math.random() * 80);
            }
        }

        for(int[] a : matrix){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();

        for(int[] a : matrix){
            System.out.println(Arrays.toString(a) + " sum: " + sum(a));
        }

        System.out.println();
        bubbleSort(matrix);
        for(int[] a : matrix){
            System.out.println(Arrays.toString(a));
        }



    }

    static void bubbleSort(int[][] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (sum(arr[j]) > sum(arr[j + 1])) {
                    // swap arr[j+1] and arr[j]
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static int sum(int[] arr){
        return Arrays.stream(arr).sum();
    }
}
