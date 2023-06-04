package study20230519;

public class Study01 extends Human{

	public static void main(String[] args) {
		/*インスタンスの生成
		 * コンストラクタを使って初期値を設定する
		 */
		Teacher te  = new Teacher("田中","6/21","12345");
		Student st = new Student("大川内","2/24","230101");

		//名前と振舞いを表示する
		System.out.println(te.getName()+"は"+te.teching());
		System.out.println(st.getName()+"は"+st.learning());

	}

}
