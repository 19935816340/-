package com.company;

public class 菱形19 {
    public static void main(String[] args) {
        lingX(7);
    }
    public static void lingX(int n){
        for (int i = 0; i < (n+1)/2; i++) {
            for (int j = 0; j < n; j++) {
               if (j==(n-1)/2-i||j==(n-1)/2+i){
                   System.out.print("*");
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println("");

        }
        for (int i = n; i < (n-1)/2; i--) {
            for (int j = 0; j < n; j++) {
                if (j ==(n-1)/2-i+5 ||j == (n-1)/2+i-5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
