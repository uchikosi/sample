package jp.co.diworks.action;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello World");
		int total =gokei();
		System.out.println(total);
		System.out.println(gokei());
		System.out.println(gokei2(2,3));

		System.out.println(hikizan(10, 10));
        System.out.println(kakezan(10, 10));
        System.out.println(warizan(10, 10));
    }

	public static int gokei() {
		return 1+1;
	}
	public static int hikizan(int number1 ,int number2) {
		return number1-number2;
	}

	public static int kakezan(int number1 ,int number2) {
		return number1*number2;
	}
	public static int warizan(int number1 ,int number2) {
		return number1/number2;
	}
	public static int gokei2(int number1 ,int number2) {
		return number1+number2;
	}
}
