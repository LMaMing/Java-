package chapter3;

public class BMIexponent {
	public static void main(String[] args) {
		flaot height = 1.73;
		int weight = 65;
		double exponent = weight / (height * height);
		if (exponent < 18.5)
			System.out.println("�������ع��ᣬ�����Ե�");
		if ((exponent >= 18.5) && (exponent < 24.9))
			System.out.println("�������غ����������������~");
		if ((exponent >= 24.9) && (exponent < 29.9))
			System.out.println("�������ع��أ����˶���");
		if (exponent > 29.9)
			System.out.println("�����Ƿ���");
	}
}
