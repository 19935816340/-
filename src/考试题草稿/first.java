package 考试题草稿;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入A、B、a、b,要求A、B均大于等于1");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        mathTest(A,B,a,b);
    }
    public static void mathTest(int A,int B,int a,int b){
        int x,y,num;
        int max = 0;
        int X = 0;
        int Y = 0;
        if (A<1|B<1|a>312|b>312){
            System.out.println("输入数据错误");}
        else {
            for (int i = 1; i < A+1; i++) {
                x = i;
                for (int j = 1; j < B+1; j++) {
                    y = j;

                    if ( (double)x/y == (double)a/b){
                        num = x*y;
                        if (num>max){
                            max = num;
                            X = x;
                            Y = y;
                        }
                        continue;
                    }
                }
            }
            if (max == 0) {
                System.out.println(0+" "+0);
            }else {
                System.out.println(X+" "+Y);
            }
        }
        }
    }

