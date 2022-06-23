package com.company.github;
//Сложение без сложения
public class L {
    public static void main(String[] args) {
        System.out.println(sum(100,100));
    }
    private static int sum(int a, int b){
        if(a < 0){
            System.out.println("Данные не верные");
        }
        if(b < 0){
            System.out.println("Данные не верные");
        }
        return calculate(a, b);
    }
    private static int calculate(int a, int b){
        if (b == 0){
            return a;
        }
        return calculate(a+1, b-1);
    }
}
