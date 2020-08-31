package com.company;

import java.util.Scanner;

public class 企业奖金 {
    //题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
    // 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
    // 20万到40万之间时，高于20万元的部分，可提成5%；
    // 40万到60万之间时高于40万元的部分，可提成3%；
    // 60万到100万之间时，高于60万元的部分，可提成1.5%，
    //高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
    //程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
    public static void main(String[] args) {
        System.out.println(comm());
    }
    public static double comm(){
        double comm = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的工资");
        int s = scanner.nextInt();
         if (s<=10){
             comm = s*0.1;
         } else if (s>10&&s<=20) {
             comm = 0.1*10+(s-10)*0.075;
         } else if (s>20&&s<=40) {
             comm = 0.1*10+10*0.075+(s-20)*0.05;
         } else if (s>40&&s<=60) {
             comm = 0.1*10+10*0.075+20*0.05+(s-40)*0.03;
         } else if (s>60&&s<=100) {
             comm = 0.1*10+10*0.075+20*0.05+20*0.03+(s-60)*0.015;
         } else if (s>100) {
             comm = 0.1*10+10*0.075+20*0.05+20*0.03+40*0.015+(s-100)*0.01;
         }

        return comm;
    }
}
