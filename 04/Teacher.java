package study20230519;

public class Teacher extends Human{
	//フィールド変数の宣言
	String teacherno;
	//コンストラクタの宣言（初期値の設定）
	Teacher(String name , String birthday , String teacherno){
		this.name = name;
		this.birthday = birthday;
		this.teacherno = teacherno;
	}
	//setter,getterメソッド

	public String getTeacherno() {
		return this.teacherno;
	}
	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}
	//以外のメソッド
	String teching() {
		return "教えます";
	}
}