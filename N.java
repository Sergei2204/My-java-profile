package com.company.github;
//Число сочетаний
public class N {
    public static void main(String[] args) {
        System.out.println(calculate(4,2));
    }

    private static int calculate(int n, int k){
        if (k < 0){
            System.out.println("Введенны не корректные данные: 0 <= k && k <= n");
        }
        if(n < k){
            System.out.println("Введенны не корректные данные: 0 <= k && k <= n");
        }
        int x = n-k;
        return power(n,k,x);
    }

    private static int fac_n(int n){
        if (n <= 1){
            return n;
        }
        return n*fac_n(n-1);
    }

    private static int fac_k(int k){
        if (k <= 1){
            return k;
        }
        return k*fac_k(k-1);
    }

    private static int fac_n_k(int x){
        if (x <= 1){
            return x;
        }
        return x*fac_n_k(x-1);
    }

    private static int power(int n, int k, int x){
        return fac_n(n)/(fac_k(k)*fac_n_k(x));
    }
}


