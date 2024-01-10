package telran.string.controller;

public class StringApplic {

	public static void main(String[] args) {
		String str = "Good by,   ";
		System.out.println(str);
		str = str + "Miracle";
		System.out.println(str);
		greeting("Frontic");
		double result = calculator(1, 0, "/");
		System.out.println("Result =  " + result);
	}

	public static void greeting(String name) {
		System.out.println("Welcome Belcome, " + name + "!");
	}

	public static double calculator(double x, double y, String oper) {
		switch (oper) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			return x / y;

		default:
			return 0. / 0;
		}
	}

}
