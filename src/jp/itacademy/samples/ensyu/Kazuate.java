package jp.itacademy.samples.ensyu;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {
	public static void main(String[] args) {
		Random rnd = new Random();
		//int count;

		int ran = rnd.nextInt(100) + 1;
		//count=0;ran=Random;count++
		while (true) {
			System.out.println("1����100�܂ł̐�������͂��Ă�������");

			Scanner scanner = new Scanner(System.in);
			int nu = scanner.nextInt();

			if (nu == ran) {
				System.out.println("�����ł��I");
				System.out.println("�@+ cut + ��ڂŐ����ł����B");
				break;
			}
		if (nu > ran) {
			System.out.println("�����Ə������ł�");
		}
		if (nu < ran) {
			System.out.println("�����Ƒ傫���ł�");
		}
	}
	}
}
