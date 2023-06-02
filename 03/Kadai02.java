public class Kadai02{
    public static void main(String[]args){
        int num1 = 10;
        int num2 = 20;
        Calculation ca = new Calculation();
        int num3 =ca.sub(num1,num2);
        System.out.println("減算結果は" + num3 + "です");
    }
}