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

//Staffクラスを継承し、Staffクラスが持っているフィールドやgetter、setterが利用可能
class RemoteStaff extends Staff {
	public String location;
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
}

//------------------------------------------------------

public class StaffInfo {

	public static void main(String[] args) {
		// public Staff(String name, int staffid, String email)
		Staff sato = new Staff("Takuma Sato", 1234, "1@test");
		//sato.name = "Takuma Sato";

		RemoteStaff tanaka = new RemoteStaff("Kei Tanaka", 5678, "2@test");
		tanaka.location = "大阪";

		//sato.sayhello();
		//System.out.println(sato.name);

		System.out.println("【社員情報】");
		System.out.println("氏名：" + sato.getName());
		System.out.println("社員番号：" + sato.getStaffid());
		System.out.println("email：" + sato.getEmail());

		System.out.println("【社員情報】");
		System.out.println("氏名：" + tanaka.getName());
		System.out.println("社員番号：" + tanaka.getStaffid());
		System.out.println("email：" + tanaka.getEmail());
		System.out.println("email：" + tanaka.location);
	}
}
