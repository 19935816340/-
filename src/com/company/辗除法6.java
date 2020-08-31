package com.company;

public class 辗除法6 {
    public static void main(String[] args) {
        min_max(55,35);
    }
    public static  void min_max(int m,int n){
        int l = 1;
        int yu = 0;
        int min = m*n;
        if (m>n){
            l = m;
            m = n;
            n = l;
        }while (m!=0){
            yu = n%m;
            n = m;
            m = yu;
        }
         int max = n;
         min = min/n;
        System.out.println("最大公约数："+max+"最小公倍数："+min);
    }
}
