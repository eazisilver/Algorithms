 /*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 2070
 */
import java.util.Scanner;
public class SWEA2070 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 

        for(int tc =1; tc<=T; tc++){
            String s = sc.nextLine();
            String[] nums = s.split(" ");
            String answer = NumCompare(nums);
            //
            //
            //
            System.out.println("#" + tc + " " + answer);
        }
        sc.close();
    }
    private static String NumCompare(String[] nums){
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = a-b;
        if(c < 0){
            c = -1;
        }else if(c > 0){
            c = 1;
        }else{
            c = 0;
        }
        switch(c){
            case -1: return "<";
            case  0: return "=";
            case  1: return ">";
        }
        return "";
    }
}
