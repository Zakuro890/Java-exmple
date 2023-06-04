package study20230519;

public class Study02 extends Human{

	public static void main(String[] args) {
		//インスタンスの生成と初期値の設定
		Teacher te  = new Teacher("田中","6/21","12345");
		Student st = new Student("大川内","2/24","230101");

		//先生と学生を紹介するクラスのインスタンス生成
		Introduction in = new Introduction();

		//先生と学生のインスタンスを紹介クラスへ引数として渡す
		in.TeacherIntro(te);
		in.StudentIntro(st);

		//実行結果を見やすくする為の改行
		System.out.println();

		//先生と学生のインスタンスをsuperクラスの型で受け取る
		in.HumanIntro(te);
		in.HumanIntro(st);

	}

}
