import java.util.*;
class SWEA8104
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for(int tc=1; tc<=T; tc++){
            String NK = sc.nextLine();
            int N = Integer.parseInt(NK.split(" ")[0]);
            int K = Integer.parseInt(NK.split(" ")[1]);

            int[][] ranks = new int[N][K];
            boolean flag = true;  //T:홀수 F:짝수
            int num = 0;
            String answer = "";

            for(int i=0; i<N; i++){
                if(flag){
                    num = K*i+1;
                    for(int j=0; j<K; j++){
                        ranks[i][j] = num;
                        num ++;
                    }
                    flag = false;
                }
                else{
                    num = K*(i+1);
                    for(int j=0; j<K; j++){
                        ranks[i][j] = num;
                        num--;
                    }
                    flag = true;
                }
            }
            for(int i=0; i<K; i++){
                int hap = 0;
                for(int j=0;j<N;j++){
                    hap += ranks[j][i];
                }
                answer = " " + hap;
            }
            System.out.println("#" + tc + " " + answer);
        }
        sc.close();
    }
}
