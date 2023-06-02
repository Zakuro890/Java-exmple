class Analysis{
    public void sum(int a,int b, int c){
        int sum;
        sum =a + b + c;
        System.out.println("合計値は"+sum);
    }
    public void max(int a,int b,int c){
        int max=0;
        int i;
        int[] array ={a,b,c};
        for(i =0;i <array.length;i++){
            if(array[i] >max){
                max = array[i];
            }     
        }
        System.out.println("最大値は"+max);
    }  
    public void min(int a,int b,int c){
        int i;
        int min=10000;   
        int[]array ={a,b,c};
        for(i = 0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("最小値は"+min);
    }  
    public void avg(int a,int b,int c){
        double avg;
        avg = (double)(a + b + c)/3; 
        System.out.println("平均値は"+avg);
    }
     
}
