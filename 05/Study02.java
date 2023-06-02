package study20230602;

public class Study02 {
	public static void main(String[] args) {
		//業務連絡クラスのインスタンス生成と初期値設定
		BusinessAnnounce ba = new BusinessAnnounce("雑貨品","大川内");
		//アナウンス開始のメッセージ
		ba.announceStart();
		//アナウンス本文メッセージ
		ba.mainMessage();
		//アナウンス終了のメッセージ
		ba.announceEnd();
	}
}
