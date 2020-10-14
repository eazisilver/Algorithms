/*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 2063
 * 
 * 버블정렬 
 * 시간복잡도 O(n²), 공간복잡도 O(n) 
 */
import java.util.*;
class SWEA2063 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] nums = Arrays.asList(s.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        int answer = MiddleNumber(n, nums);
        System.out.println(answer);
        sc.close();
    }
    private static int MiddleNumber(int n, int[] nums){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]>nums[j]){
                    int temp = 0;
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[n/2];
    }
}
