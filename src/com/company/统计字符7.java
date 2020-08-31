package com.company;

public class 统计字符7 {
    //题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
    //程序分析：利用while语句,条件为输入的字符不为'\n'.
    public static void main(String[] args) {
        cha("vbqwebd   6516去酒吧回顾&*&*）（");

    }
    private static void cha(String s){
        String a = "[\u4e00-\u9fa5]";

        String b = "[a-zA-Z]";
        String c = "[\\s]";
        String d = "[0-9]";
        int A = 0;
        int B= 0;
        int C = 0;
        int D = 0;
        int E = 0;

        char[]chars = s.toCharArray();
        String[]arr_string = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            arr_string[i] = String.valueOf(chars[i]);}
            for (String ss:arr_string){
                if (ss.matches(a)){
                    A++;
                }else if (ss.matches(b)){
                    B++;
                }else if (ss.matches(c)){
                    C++;
                }else if (ss.matches(d)){
                    D++;
                }else {
                    E++;
                }
            }
        System.out.println("汉字"+A+"个，字母"+B+"个，空格"+C+"个，数字"+D+"个，其他字符"+E+"个");
    }
}
