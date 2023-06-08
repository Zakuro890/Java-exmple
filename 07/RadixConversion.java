package r2a103;

public class RadixConversion {
	public int[] decimalBinary(int num) {
		int[] array1 = {0,0,0,0,0,0,0,0};
		
		int a = 128;
		
		for(int i = 0; i< array1.length; i++) {
			if(num >= a) {
				array1[i] = 1;
				num -= a;
			}
			a /= 2;
		}
		
		return array1;
		
			
	}
}
