  
/*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 2058
 */
import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] nums = sc.nextLine().toCharArray();
        int answer = 0;
        for(int i=0;i<nums.length;i++){
            answer += nums[i] - '0';
        }
        System.out.println(answer);
        sc.close();
    }
}
 
