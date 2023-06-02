import java.io.*;
public class Kadai06{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Analysis Ay =new Analysis();
        System.out.print("num1>");
       int num1 = Integer.parseInt(br.readLine());
        System.out.print("num2>" );
        int num2 = Integer.parseInt(br.readLine());
        System.out.print("num3>" );
       int num3 = Integer.parseInt(br.readLine());
        Ay.sum(num1,num2,num3);
        Ay.max(num1,num2,num3);
        Ay.min(num1,num2,num3);
        Ay.avg(num1,num2,num3);

    }
}