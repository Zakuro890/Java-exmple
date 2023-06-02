public class Pra10{
    public static void main(String[]args){
        //3行４列の２次元配列arrayの宣言と初期値設定
        int[][] array ={{1,3,5,7},{2,4,5,7},{1,3,6,9}};
        //2重ループを使って内容の出力
        for(int i =0; i <=array.length;i++){
            for(int j =0; j <=array.length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}