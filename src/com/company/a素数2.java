package com.company;

public class a素数2 {
//    题目：判断101-200之间有多少个素数，并输出所有素数。
//    程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
public static void main(String[] args) {
    int count = 0;
    for (int k = 101; k < 201; k++) {
        if (sushu(k)){
            count++;
            System.out.print(k+" ");
        }
    }
    System.out.println(count);

}
public static boolean sushu(int j){
    boolean n  = false;
    if (j == 1){
        n = false;
    }
    for (int i = 2; i <= Math.sqrt(j); i++) {
        if (j%i == 0||j==1){
            n = false;
            break;
        }else
            n = true;
    }
    return n;
}
}
