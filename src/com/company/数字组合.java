package com.company;

public class 数字组合 {
    //题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    public static void main(String[] args) {
        for (int i = 1; i < 5 ; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == j)
                    continue;
                for (int k = 1; k < 5; k++) {
                   if (i!=k&&j!=k){
                       int num = i*100 + j *10+k;
                       System.out.print(num + " ");
                   }
                }
            }
        }

    }

}
