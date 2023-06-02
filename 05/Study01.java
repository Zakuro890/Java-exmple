package study20230602;

public class Study01 {
	public static void main(String[] args) {
		//アナウンスクラスのインスタンス生成と初期値設定
		Announce an = new Announce("市内","大川内");
		//アナウンス開始のメッセージ
		an.announceStart();
		//アナウンス本文メッセージ
		an.mainMessage();
		//アナウンス終了のメッセージ
		an.announceEnd();
	}
}
