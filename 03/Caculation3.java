class Calculation3{
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