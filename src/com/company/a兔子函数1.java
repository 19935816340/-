package com.company;

public class a兔子函数1 {
    //古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第个月的兔子对数为多少？
    //程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
    public static void main(String[] args) {
        System.out.println(sheng(10));
    }
    public static int sheng(Integer n) {
            if (n == 1 || n == 2) {
                return 1;
            } else
                return sheng(n - 1) + sheng(n - 2);
    }
}
