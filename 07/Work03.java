package r2a103;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import r2a104.Arrayproce;
public class Work03 {

	public static void main(String[] args) throws IOException  {
		// TODO 自動生成されたメソッド・スタブ
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 Arrayproce ap = new arrayproce();
		 int[] array1 = new int[5];
		 
		 for(int i = 0; i < 5; i++) {
			 System.out.print("入力＞");
			 array1[i] = Integer.parseInt(br.readLine());
		 }
		 
		 int max = ap.max(array1);
		 System.out.println("入力値の最大は" + max + "です");
		 
		 int min = ap.min(array1);
		 System.out.println("入力値の最少は" + min + "です");
		
		
	}

}
