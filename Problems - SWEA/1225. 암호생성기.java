  
/*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 1225
 * 
 * ArrayList 사용
 */
 
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        for(int tc=1; tc<=10; tc++){
            sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));

            boolean flag = true;
            while(flag){
                for(int i=1;i<=5;i++){
                    int x = Integer.parseInt(list.get(0))-i;
                    if(x <= 0){
                        x = 0;
                    }
                    list.remove(0);
                    list.add(Integer.toString(x));
                    if(x == 0){
                        flag = false;
                        break;
                    }
                }
            }
            String result = "";
            for(String s: list){
                result += s + " ";
            }
            System.out.println("#" + tc + " " + result);
        }
        sc.close();
    }
}
