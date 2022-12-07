import exceptions.NoPositiveNumbersException;

import javax.swing.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter elem #" + (i + 1) + ": ");
            try {
                arr[i] = scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Error input type!");
                scanner.next();
                i--;
            }
        }
        try {
            checkArray(arr);
            System.out.println(Arrays.toString(arr));;
        }
        catch (NoPositiveNumbersException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.stream(arr).filter(x -> x % 2 == 0 && x > 0).sum() / Arrays.stream(arr).filter(x -> x % 2 == 0 && x > 0).count());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkArray(int[] arr) throws NoPositiveNumbersException {
        int count = 0;
        for (int j : arr) {
            if (j > 0) count++;
        }
        if(count == 0) throw new NoPositiveNumbersException("Array do not contain positive numbers.");
    }
}
