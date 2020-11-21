package java_project1_section3;

class Staff {
	String name;
	int staffid;
	String email;

	public void sayhello() {
		System.out.println("Hello " + this.name);
		//thisはsayhello（メソッド）を定義しているクラス
	}
}
public class Staffinfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff sato = new Staff();
		sato.name = "Takuma Sato";

		sato.sayhello();
		//System.out.println(sato.name);
	}

}
