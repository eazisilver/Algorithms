/*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 2050
 */
import java.util.Scanner;

class SWEA2050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        String answer = "";
        for(int i=0; i<c.length;i++){
            answer += ((int)c[i]-64 + " ");  
        }
        System.out.println(answer);
        sc.close();
    }
}
