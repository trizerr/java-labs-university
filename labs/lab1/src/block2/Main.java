package block2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Created array: " + Arrays.toString(array));

        for(int i = a; i < b; i++){
            if(array[i] % 2 == 0){
                array[i] = array[i - 1] + array[i + 1];
            }
        }

        System.out.println("Array after changes: " + Arrays.toString(array));


    }
}
