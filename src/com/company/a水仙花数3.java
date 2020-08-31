package com.company;

public class a水仙花数3 {
//    题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
//    程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
public static void main(String[] args) {

    for (int i = 100; i < 1000; i++) {
        int count = 0;
        if (water1(i)){
            count++;
            System.out.print(i+" ");
            System.out.println(" ");
        }
    }
    for (int i = 100; i < 1000; i++) {
        int count = 0;
        if (water1(i)){
            count++;
            System.out.print(i+" ");
        }
    }
}
//方法一
public static boolean water1(int i){
    boolean n = false;
    if (i<100||i>=1000){
        n=false;
        return n;
    }else {
        int n1= i%10;
        int n2 = (i-n1)%100/10;
        int n3 = (i-n1-n2*10)/100;
        if (i==n1*n1*n1+n2*n2*n2+n3*n3*n3){
            n = true;
            return n;
        }
    }
return n;
}
//方法二
public static boolean water2(int i){
    boolean n = false;
    if (i<100&&i>=1000){
        n=false;
        return n;
    }else {
        int n1= i/100;
        int n2 = i%10;
        int n3 = i/10-n1*10;
        if (i==n1*n1*n1+n2*n2*n2+n3*n3*n3){
            n = true;
            return n;
        }
    }
    return n;
}
}
