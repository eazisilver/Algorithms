import java.util.Scanner;

class SWEA2056 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int tc =1; tc<=T; tc++){
            String s = sc.nextLine();
            String mmdd = Calendar(s.substring(4, 6),s.substring(6, 8));
            String answer = (mmdd == "-1") ? "-1" : s.substring(0, 4) + "/" + mmdd;
            //
            //
            //
            System.out.println("#" + tc + " " + answer);
        }
        sc.close();
    }
    private static String Calendar(String m, String d){
        int mm = Integer.parseInt(m);
        int dd = Integer.parseInt(d);

        if(!(mm>=1 && mm<=12)) {return "-1";}
        else{
            switch(mm){
                case 4: case 6: case 9: case 11:
                    if(!(dd>=1 && dd<=30)){ return "-1"; }
                case 2:
                    if(!(dd>=1 && dd<=28)){ return "-1"; }  
                default:
                    if(!(dd>=1 && dd<=31)){ return "-1"; }  
            }
        }
        return String.valueOf(String.format("%02d", mm)) + "/" + String.valueOf(String.format("%02d", dd));
    }
}
