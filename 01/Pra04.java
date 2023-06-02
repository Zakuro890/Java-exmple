import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Pra04{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("点数>");
        int tensu = br.readLine;
        if(tensu >=90){
            System.out.println("秀");
        }else if(tensu>=80){
            System.out.println("優");
        }else if(tensu >=70){
            System.out.println("良");
        }else if(tensu>=60){
            System.out.println("可");
        }else{
            System.out.println("不合格");
        }
    }
}