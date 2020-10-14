/*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 1204
 * 
 * StringTokenizer 으로 문자열 받기
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for(int tc =1; tc<=T; tc++){
            Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int answer = ScoreDistr(tokenizer);
            
            writer.write("#" + tc + " " + answer+"\n");
        }
        writer.close();
    }
    private static int ScoreDistr(StringTokenizer list){
        int cnt = 0;
        int index = 0;
        int[] score = new int[101];

        for(int i=0; i<1000; i++){ score[Integer.parseInt(list.nextToken())]++; }

        for(int i=0; i<=100; i++){
            if(cnt < score[i]){
                cnt = score[i];
                index = i;
            }
            else if(cnt == score[i]){
                if(index <= i){
                    index = i;
                }
            }
        }
        return index;
    }
}
