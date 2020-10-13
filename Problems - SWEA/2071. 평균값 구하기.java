 /*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 2071
 */
import java.util.Scanner;
public class SWEA2071 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for(int tc =1; tc<=T; tc++){
            String s = sc.nextLine();
            String[] nums = s.split(" ");
            int hap = 0;
            for(int i=0;i<nums.length; i++){
                hap += Integer.parseInt(nums[i]);
            }
            System.out.println("#" + tc + " " + Math.round((double)hap/10) );
        }
        sc.close();
    }
}
 
