package r2a104;

public class Arrayproce {

	
		// TODO 自動生成されたメソッド・スタブ
		public int max(int[] array){
			int maxnum=0;
			for(int i =0;i<array.length;i++) {
				if(array[i]>maxnum) {
					maxnum=array[i];
				}
			}
			return maxnum;
		}
		public int min(int[] array) {
			int minnum =0;
			for(int i =0; i <array.length;i++) {
				if(array[i]<minnum) {
					minnum =array[i];
				}
			}
			return minnum;
		}

	

}