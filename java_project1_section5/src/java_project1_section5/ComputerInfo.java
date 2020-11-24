package java_project1_section5;

class Computer {
	public String os;
	public int memory;
	public int storage;

}
public class ComputerInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer desktop = new Computer();
		desktop.os = "windows";
		desktop.memory = 4;
		desktop.storage = 256;

		//desktop
		System.out.println("OS: " + desktop.os);
		System.out.println("Memory: " + desktop.memory + "GB");
		System.out.println("Storage: " + desktop.storage + "GB");

		//------------------------------------------
		//desktop2にdesktopのデータを参照している
		//あるインスタンスのメモリー領域を効率よく利用でき、メモリー量やソースコードを節減できる
		Computer desktop2 = desktop;
		desktop2.os = "mac";

		//desktop2
		System.out.println("\nOS: " + desktop2.os);
		System.out.println("Memory: " + desktop2.memory + "GB");
		System.out.println("Storage: " + desktop2.storage + "GB");

		//desktop
		System.out.println("\nOS: " + desktop.os);
		System.out.println("Memory: " + desktop.memory + "GB");
		System.out.println("Storage: " + desktop.storage + "GB");
	}
}
