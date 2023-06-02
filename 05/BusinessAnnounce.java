package study20230602;

public class BusinessAnnounce extends Announce{
	//係と担当者のフィールド変数
	private String clerk;
	private String name;

	//コンストラクタでフィールドに値を設定
	BusinessAnnounce(String clerk , String name){
		this.clerk = clerk;
		this.name = name;
	}
	//アナウンス本文のオーバライド
	void mainMessage() {
		System.out.println(clerk+"担当の"+name+"さん、");
		System.out.println("１階受付カウンターにお客様がお待ちです\n");
	}
	//アナウンス開始のメッセージ
	void announceStart() {
		super.announceStart();
		System.out.println("業務連絡です\n");
	}
}
