public class Calculation{
    public void add(int a,int b){
        int sum = a + b;
        System.out.println("加算結果は" + sum + "です");
    }
    public int sub(int a,int b){
        return a-b;
    }
     public void mult(int a){
        a = a*2;
        System.out.println(a);
    }
        public void div(int a,int b){
        double div; 
        div = a/b;
        if(b == 0){
            System.out.println("0除算です");
        }else{
            System.out.println(a +'/' + b +"の除算結果は" + div + "です");
        }
    }
}