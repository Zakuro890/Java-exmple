import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Step01{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("西暦>");
        int year =Integer.parseInt(br.readLine());
        if(year % 400 == 0){
            if(year % 100 != 0 && year % 4 == 0){
                System.out.println("うるう年");
            }
            System.out.println("うるう年");
            }else{
         System.out.println("平年");
    }
}
}

