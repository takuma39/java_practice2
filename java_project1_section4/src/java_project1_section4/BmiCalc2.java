package java_project1_section4;
import java.util.Scanner;

public class BmiCalc2 {
/* BMI（体格指数を計算するプログラム）
 * BMI = 体重 / （身長 * 身長）
 * 体重 kg / 身長 cm
 */
	public static void main(String[] args) {
		double weight, height, bmi;

		//weight = 65;
		//height = 172;

		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？ (kg) :");
		weight = stdIn.nextDouble();

		System.out.println("身長は？ (cm) :");
		height = stdIn.nextDouble();

		height /=  100;

		bmi = weight / (height * height);

		System.out.println("BMI: " + bmi + "です。");


		//if文
		if (bmi < 18.5) {
			System.out.println("痩せ型です");
		} else if (bmi < 25) {
			System.out.println("標準です");
		} else {
			System.out.println("肥満です");
		}

	}

}
