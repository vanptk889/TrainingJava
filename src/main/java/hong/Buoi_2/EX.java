package Buoi_2;

import java.util.Scanner;

public class EX {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập n:");
        int n = scanner.nextInt();
        int[] arr = inputArray(n);
        int sum = sumAllElementDivisionByFive(arr);
        System.out.println("Tổng các phần tử chia hết cho 3 có trong mảng là: " + sum);
    }

    private static int sumAllElementDivisionByFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    private static int[] inputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        return arr;

    }
}


