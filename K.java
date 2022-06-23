package com.company.github;

// Возведение в степень. Задание под K!
public class K {
    public static void main(String[] args) {
        System.out.println(calculate(2, 3));
    }

    public static int calculate(int a, int n){
        if (a == 0 && n == 0){
            System.out.println("Введенные данные не соответсвуют условию");
        }

        if (n < 0){
            System.out.println("Введенные данные не соответсвуют условию");
        }

        if (a == 0){
            return  0;
        }

        if (n == 0){
            return a;
        }
        return power(a, n);
    }

    public static int power(int a, int n){
        if (n == 1) return a;
        return a * calculate(a,n-1);
    }
}
