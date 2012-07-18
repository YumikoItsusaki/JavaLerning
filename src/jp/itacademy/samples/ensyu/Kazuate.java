package jp.itacademy.samples.ensyu;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {
	public static void main(String[] args) {
		Random rnd = new Random();

		int ran = rnd.nextInt(100) + 1;
		while (true) {
			System.out.println("1Ç©ÇÁ100Ç‹Ç≈ÇÃêîéöÇì¸óÕÇµÇƒÇ≠ÇæÇ≥Ç¢");

			Scanner scanner = new Scanner(System.in);
			int nu = scanner.nextInt();

			if (nu == ran) {
				System.out.println("ê≥âÇ≈Ç∑ÅI");
				break;
			}
		}
		if (nu > ran) {
			System.out.println("Ç‡Ç¡Ç∆è¨Ç≥Ç¢Ç≈Ç∑");
		}
		if (nu < ran) {
			System.out.println("Ç‡Ç¡Ç∆ëÂÇ´Ç¢Ç≈Ç∑");
		}
	}

}
