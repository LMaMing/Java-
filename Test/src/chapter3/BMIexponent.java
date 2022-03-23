package chapter3;

public class BMIexponent {
	public static void main(String[] args) {
		flaot height = 1.73;
		int weight = 65;
		double exponent = weight / (height * height);
		if (exponent < 18.5)
			System.out.println("您的体重过轻，建议多吃点");
		if ((exponent >= 18.5) && (exponent < 24.9))
			System.out.println("您的体重很正常，无需减肥捏~");
		if ((exponent >= 24.9) && (exponent < 29.9))
			System.out.println("您的体重过重，多运动捏");
		if (exponent > 29.9)
			System.out.println("属于是肥胖");
	}
}
