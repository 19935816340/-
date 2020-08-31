package com.company;

import java.util.Scanner;

public class 第几天 {
    //题目：输入某年某月某日，判断这一天是这一年的第几天？
    //程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
    public static void main(String[] args) {
        System.out.println(days());

    }
    public static int days(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入当前的年、月、日");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int[]month_day = {31,28,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        if (year%400==0||year%4==0&&year%100==0){
         month_day[1] = 29;
        }
        for (int i = 0; i < month-1; i++) {
            days = days+month_day[i];
        }
        days = days + day;
        return days;
    }
}
