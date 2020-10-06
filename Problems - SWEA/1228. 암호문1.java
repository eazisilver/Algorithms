/*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 1228
 * 
 * ArrayList 삽입 이용
 */
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++){   
            int n       = sc.nextInt();
            sc.nextLine();
            String pw   = sc.nextLine();
            int cmdCnt  = sc.nextInt();
            sc.nextLine();
            String cmd  = sc.nextLine();
            
            ArrayList<String> pwList = new ArrayList<>(Arrays.asList(pw.split(" ")));
            ArrayList<String> cmdList = new ArrayList<>(Arrays.asList(cmd.split("I ")));

            for(int i=1;i<=cmdCnt; i++){
                String[] temp = cmdList.get(i).split(" ");
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);
                if(x >= n){
                    continue;
                }
                if(n-x < y){
                    y = n-x;
                }
                for(int j=2; j<temp.length;j++){
                    pwList.add(x, temp[j]);
                    x++;
                }
            }
            String s = "";
            for(int i=0;i<10;i++){
                s += pwList.get(i) + " ";
            }
            System.out.println("#" + tc + " " + s);
        }
        sc.close();
    }
}
