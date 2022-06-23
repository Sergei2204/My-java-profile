package com.company.github;

import java.util.Scanner;

//Сумма последовательности
public class O {
    public static void main(String[] args) {
        System.out.println(sum(0));
    }
    private static int sum(int x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число или введите ноль чтобы выйти: ");
        x = sc.nextInt();
        if(x == 0){
            return x;
        }
        return x+sum(x);
    }
}
