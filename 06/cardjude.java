package r2a104;
public class cardjude{
	

public int card(String i,int Mycard) {
	int s=0;
	if(i=="ダイヤのA" || i =="スペードのA" || i== "ハートのA" || i=="クローバーのA" ) {
		if(Mycard >=11) {
			s = 1;
		}else {
			s =11;
		}
	}
	if(i=="ダイヤの2" || i =="スペードの2" || i== "ハートの2" || i=="クローバーの2" ) {
		s= 2;
	}
	if(i=="ダイヤの3" || i =="スペードの3" || i== "ハートの3" || i=="クローバーの3" ) {
		s= 3;
	}
	if(i=="ダイヤの4" || i =="スペードの4" || i== "ハートの4" || i=="クローバーの4" ) {
		s= 4;
	}
	if(i=="ダイヤの5" || i =="スペードの5" || i== "ハートの5" || i=="クローバーの5" ) {
		s= 5;
	}
	if(i=="ダイヤの6" || i =="スペードの6" || i== "ハートの6" || i=="クローバーの6" ) {
		s= 6;
	}
	if(i=="ダイヤの7" || i =="スペードの7" || i== "ハートの7" || i=="クローバーの7" ) {
		s= 7;
	}
	if(i=="ダイヤの8" || i =="スペードの8" || i== "ハートの8" || i=="クローバーの8" ) {
		s= 8;
	}
	if(i=="ダイヤの9" || i =="スペードの9" || i== "ハートの9" || i=="クローバーの9" ) {
		s= 9;
	}
	if(i=="ダイヤの10" || i =="スペードの10" || i== "ハートの10" || i=="クローバーの10" ) {
		s= 10;
	}
	if(i=="ダイヤのJ" || i =="スペードのJ" || i== "ハートのJ" || i=="クローバーのJ" ) {
		s= 10;
	}
	if(i=="ダイヤのQ" || i =="スペードのQ" || i== "ハートのQ" || i=="クローバーのQ" ) {
		s= 10;
	}
	if(i=="ダイヤのK" || i =="スペードのK" || i== "ハートのK" || i=="クローバーのK" ) {
		s= 10;
	}
	return s;
}
}