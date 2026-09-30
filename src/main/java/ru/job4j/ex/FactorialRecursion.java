package ru.job4j.ex;

public class FactorialRecursion {
    public static int calc(int n) {
        int result = n;
        if (n == 1 || n == 0) {
            result = 1;
        } else {
            for (int i = n - 1; i >= 1; i--) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = calc(0);
        System.out.println(result);
    }
}
