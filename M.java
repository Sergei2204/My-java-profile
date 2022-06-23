package com.company.github;
//Числа Фибоначчи
public class M {
    public static void main(String[] args) {
        System.out.println(sumFib(6));
    }
    private static int sumFib(int n){
        if(n < 0){
            System.out.println("Данные не верные");
            return n;
        }
        return fib(n);
    }
    private static int fib(int n){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
