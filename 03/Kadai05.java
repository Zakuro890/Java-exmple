import java.io.*;
class Kadai05{
    public static void main(String[]args)IOException{
    BuffredReaderbr = new BuffredReaderbr(new InputStreamReader(System.in));
    num1 = Integer.parseInt(br.readLine());
    num2 = Integer.parseInt(br.readLine());
    Calculation(add(),sub(),mult(),div());
    System.out.println("num1>" + num1);
    System.out.println("num2>" + num2);
    System.out.println("加算結果は"+ add());
    System.out.println("減算結果は" + sub());
    System.out.println("12の2倍は"+mult());
    System.out.println("12/5の除算結果は" +　div());
    


    }
}