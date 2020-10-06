/*
 * eazisilver@GitHub <jieunlee.me@gmail.com>
 * SW Expert Academy 1222~1224
 * 
 * 후위식 계산
 */

import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      
        for(int tc=1; tc<=1;tc++){
            //sc.nextInt();
            String str = sc.next();
            String postfix = "";
            
            Stack<String> stack = new Stack<>();
            for(int i=0; i<str.length(); i++){
                if(Character.isDigit(str.charAt(i))){
                    postfix += Character.toString(str.charAt(i));
                }
                else{
                    if(stack.empty()){
                        stack.push(Character.toString(str.charAt(i)));
                    }
                    else{
                        switch(str.charAt(i)){
                            case '+':
                            case '*':
                                while(!stack.empty()){
                                    if(Prec(stack.peek()) >= Prec(Character.toString(str.charAt(i)))){
                                        postfix += stack.pop();
                                    }
                                    else{
                                        break;
                                    }
                                }
                                stack.push(Character.toString(str.charAt(i)));
                                break;
                            case '(':
                                stack.push(Character.toString(str.charAt(i)));
                                break;
                            case ')':
                                while(!stack.empty()){
                                    String op = stack.pop();
                                    if(op.equals("(")){
                                        break;
                                    }
                                    else{
                                        postfix += op;
                                    }
                                }
                                break;
                        }
                    }
                }
            }
            if(!stack.empty()){
                while(!stack.empty()){
                    postfix += stack.pop();
                }
            }
            int result = CalcPostfix(postfix);
            System.out.println("#" + tc + " " + result);
        }
        sc.close();
    }
    
    //연산자 우선순위
    private static int Prec(String op){
        switch(op){
            case "+" : return 1; 
            case "*" : return 2;
        }
        return -1;
    }

    //후위식계산
    private static int CalcPostfix(String postfix){
        int a, b = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<postfix.length();i++){
            if(Character.isDigit(postfix.charAt(i))){
                stack.push(postfix.charAt(i)-'0');
            }
            else{
                a = stack.pop();
                b = stack.pop();
                switch(postfix.charAt(i)){
                    case '+': stack.push(a+b); break;
                    case '*': stack.push(a*b); break;
                }
            }
        }
        return stack.pop();
    }
}
