package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        getFactorial1();
        System.out.println(getFactorial2(6));
        System.out.println(getFibonacci(19));
        System.out.println(Arrays.toString(reverseArr(new int[]{12, 23, 34, 45, 56, 67, 78})));
        System.out.println(Arrays.toString(splitString("qwe wer ert rtyyyy fdvsg")));
    }

    public static long getFactorial1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        long n = input.nextLong();
        long res = 1;
        for (long i = 1; i <= n; i++)
            res = res * i;
        System.out.println(res);
        return res;
    }

    public static long getFactorial2(long n){
        return (n <= 1) ? 1 : n * getFactorial2(n - 1);
    }

    public static int getFibonacci(int n){
        return (n <= 1) ? n : getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static int[] reverseArr(int[] arr) {
        for (int i = 0; i < arr.length/2; i++){
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        return arr;
    }

    public static String[] splitString(String str){
        return str.split(" ");
    }
}