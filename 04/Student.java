package study20230519;

public class Student extends Human{
	//フィールド変数の宣言
	String studentno;
	//コンストラクタの宣言（初期値の設定）
	Student(String name , String birthday , String studentno){

		this.studentno = studentno;
	}
	//setter,getterメソッド

	public String getStudentno() {
		return this.studentno;
	}
	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}
	//以外のメソッド
	String learning() {
		return "学習します";
	}
}
