package com.company;

public class a条件嵌套5 {
    //题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
    //程序分析：(a>b)?a:b这是条件运算符的基本例子。
    public static void main(String[] args) {
        System.out.println(qiAnTao(95));
    }
    public static String qiAnTao(int i){
        String s = i>=90?"A":(i<60?"C":"B");
        return s;
    }
}
