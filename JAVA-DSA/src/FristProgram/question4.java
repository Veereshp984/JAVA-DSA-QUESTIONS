package FristProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().trim().charAt(0);
        if(ch == '+' ){
            System.out.println(a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        }else if (ch == '*') {
            System.out.println(a * b);
        }else if (ch == '/') {
            System.out.println(a / b);
        }
    }
}
