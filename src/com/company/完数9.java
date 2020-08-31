package com.company;

public class 完数9 {
    //题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            if (wan(i))
                System.out.print(i+"  ");
        }
    }
    public static  boolean  wan(int a){
        boolean b = false;
        int sum = 0;
        for (int i = 1; i <= a/2; i++) {
            if (a%i == 0){
                sum += i;
            }
        }
        if (sum == a){
            b = true;
        }
    return b;
}
}
