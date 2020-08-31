package com.company;

public class 同数相加8 {
    public static void main(String[] args) {
        //题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
        System.out.println(shiZi(2,4)+"  "+math(2,4));
    }
    public static StringBuffer shiZi(int a,int b){
        StringBuffer A = new StringBuffer();
        StringBuffer B = new StringBuffer();

        for (int i = 0; i < b; i++) {
            A = A.append(a);
            B = B.append(A);
            if (i<a){
                B.append("+");
            }else
                B.append("=");
        }
        return B;
    }
    public static  int math(int a,int b){
        int shu = 0;
        int sum = 0;
        for (int i = 0; i < b; i++) {
            shu = shu*10 + a;
            sum = sum+shu;
        }
        return  sum;
    }
}
