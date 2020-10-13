
import java.util.Scanner;
public class SWEA2068 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int tc =1; tc<=T; tc++){
            String s = sc.nextLine();
            String[] nums = s.split(" ");
            int answer = MaxNumber(nums); 
            //
            //
            //
            System.out.println("#" + tc + " " + answer);
        }
        sc.close();
    }
    private static int MaxNumber(String[] nums){
        int result = 0;
        for(int i=0; i<nums.length; i++){
            if(Integer.parseInt(nums[i]) >= result){
                result = Integer.parseInt(nums[i]);
            }
        }
        return result;
    } 
}
