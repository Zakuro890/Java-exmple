package study20230602;

public class Announce {
	//場所と名前のフィールド変数
	private String place;
	private String name;

	//デフォルトコンストラクタ（未使用）
	Announce(){}

	//コンストラクタでフィールドに値を設定
	Announce(String place , String name){
		this.place = place ;
		this.name = name ;
	}

	//アナウンス開始のメッセージ
	void announceStart() {
		System.out.println("本日もご来店、誠にありがとうございます。\n");
	}

	//アナウンス本文のメッセージ
	void mainMessage() {
		System.out.println("お客様のお呼び出しを申し上げます");
		System.out.println(place+"からお越しの"+name+"様");
		System.out.println("１階受付カウンターにお越しください\n");
	}

	//アナウンス終了のメッセージ
	void announceEnd() {
		System.out.println("本日もお忙しい中、ご来店いただきまして誠にありがとうございます");
		System.out.println("引き続きごゆっくりとお買い物をお楽しみくださいませ");
	}

}
