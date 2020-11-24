package java_project1_section5;

class Staff {
	String name;
	int staffid;
	String email;

	public void sayhello() {
		System.out.println("Hello " + this.name);
		//thisはsayhello（メソッド）を定義しているクラス
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name; //nameは引数 String nameに入力したもの
		this.staffid = staffid;
		this.email = email;
	}
}

public class StaffInfo {

	public static void main(String[] args) {
		// public Staff(String name, int staffid, String email)
		Staff sato = new Staff("Takuma Sato", 1234, "test@test");
		//sato.name = "Takuma Sato";

		sato.sayhello();
		//System.out.println(sato.name);
	}
}
