 /*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 8104
 * 
 * 다차원배열 
 */
import java.util.Scanner;

public class SWEA2072 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for(int tc =1; tc<=T; tc++){
            int odd = 0;
            String s = sc.nextLine();
            String[] nums = s.split(" ");
            
            for(int i=0;i<nums.length; i++){
                if(Integer.parseInt(nums[i])%2 != 0){
                    odd += Integer.parseInt(nums[i]);
                }
            }
            System.out.println("#" + tc + " " + odd);
        }
        sc.close();
    }
}
