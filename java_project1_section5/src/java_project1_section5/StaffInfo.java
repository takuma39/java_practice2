package java_project1_section5;

class Staff {
	String name;
	int staffid;
	String email;

	public void sayhello() {
		System.out.println("Hello " + this.name);
		//thisはsayhello（メソッド）を定義しているクラス
	}

	// ソース→フィールドを使用してコンストラクターを生成
	public Staff(String name, int staffid, String email) {
		super();
		this.name = name; //nameは引数 String nameに入力したもの
		this.staffid = staffid;
		this.email = email;
	}

	// ソース→getterおよびsetterの生成
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

// ------------------------------------------------------

public class StaffInfo {

	public static void main(String[] args) {
		// public Staff(String name, int staffid, String email)
		Staff sato = new Staff("Takuma Sato", 1234, "test@test");
		//sato.name = "Takuma Sato";

		//sato.sayhello();
		//System.out.println(sato.name);

		System.out.println("【社員情報】");
		System.out.println("氏名：" + sato.getName());
		System.out.println("社員番号：" + sato.getStaffid());
		System.out.println("email：" + sato.getEmail());
	}
}
