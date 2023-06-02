package study20230519;

public class Introduction {
	//先生インスタンスを紹介する処理
	void TeacherIntro(Teacher te) {
		System.out.println(te.getName()+"は"+te.teching());
	}
	//学生インスタンスを紹介する処理
	void StudentIntro(Student st) {
		System.out.println(st.getName()+"は"+st.learning());
	}
	//superクラスで先生・学生を受け取って紹介する処理
	void HumanIntro( Human hu) {
		System.out.println("私の名前は"+hu.getName());
//		System.out.println(hu.getTeacherno());
		System.out.println("私の誕生日は"+hu.getBirthday());

}
}
