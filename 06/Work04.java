package r2a104;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import r2a103.RadixConversion;
public class Work04 {

	public static void main(String[] args)throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		RadixConversion RC = new RadixConversion();
		System.out.println("10進数→2進数変換");
		
		System.out.print("数値指定>");
		int num =Integer.parseInt(br.readLine());

		
		while(num < 0 || num > 255) {
			System.out.print("数値指定>");
			num = Integer.parseInt(br.readLine());
		}
		int[] decimalbinary = RC.decimalBinary(num);
		System.out.print(num+"→");
		for(int i =0;i<decimalbinary.length;i++) {
			System.out.print(decimalbinary[i]);
		}
	}
}
