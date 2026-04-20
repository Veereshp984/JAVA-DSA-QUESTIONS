package FristProgram;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean isPalindrome = true;
        int left = 0;
        int right = input.length()-1;
        while(left < right){
            if(input.charAt(left) != input.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome == false){
            System.out.println("the given is not a palindrome");
        }else{
            System.out.println("the given string is palindrome");
        }
    }
}
