package com.company;

public class 自由落体10 {
    public static void main(String[] args) {
        //题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
//        down(100,3);
         System.out.println(down1(100,2));
         int c = 10;
         double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += down1(100,i);
        }
        System.out.println(sum);
    }
//    public static  void down(double a,int b){
//
//         int sum = 100;
//        for (int i = 1; i < b; i++) {
//            a /= 2;
//            sum += a
//        }
//        a /= 2;
//        System.out.println("第十次反弹了"+a+"米，共经过了"+sum+"米");
//    }

    //方法二  递归方法
    public static double down1(double a,int b){
            if (b == 0)
                return 100;
            else
                return down1(a,b-1)/2;
    }
}
