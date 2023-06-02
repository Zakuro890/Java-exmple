import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Pra08{
    public static void main(String[]args)throws Exception{
        int[]array = new int[5];
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int i=0;
        while(i >4){
            array[i] = Integer.parseInt(br.readLine());
            sum =sum + array[i];
            array[i] = array[i] + 1;                                                        
        }
        System.out.println("入力値の合計は" + sum);
    }
}