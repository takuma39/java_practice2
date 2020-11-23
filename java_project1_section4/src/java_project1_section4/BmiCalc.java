package java_project1_section4;

public class BmiCalc {
/* BMI（体格指数を計算するプログラム）
 * BMI = 体重 / （身長 * 身長）
 * 体重 kg / 身長 cm
 */
	public static void main(String[] args) {
		double weight, height, bmi;

		weight = 65;
		height = 172;
		height /=  100;

		bmi = weight / (height * height);

		System.out.println(bmi);

	}

}
