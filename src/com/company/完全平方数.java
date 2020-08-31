package com.company;

import java.util.Scanner;

public class 完全平方数 {
    //题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
    //程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。
    public static void main(String[] args) {
        for (int j = 0; j < 10000; j++) {
            if (wanQuAn(j+100)&&wanQuAn(j+100+168)){
                System.out.println(j);
                break;
            }
        }
    }
    public static boolean wanQuAn(int m){
        double q = Math.sqrt(m);
        boolean e = false;
        int w = (int)q;
        if (Math.pow(w,2) == m){
            e = true;
        }
       return e;
    }
}
