package jp.itacademy.samples.ensyu;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {
	public static void main(String[] args) {
		Random rnd = new Random();
		int count = 0;

		int ran = rnd.nextInt(100) + 1;
		while (true) {
			System.out.println("1から100までの数字を入力してください");

			Scanner scanner = new Scanner(System.in);
			int nu = scanner.nextInt();
			count ++; 

			if (nu == ran) {
				System.out.println("正解です！");
				System.out.println(count + "回目で正解でした。");
				break;
			}
			if (nu > ran) {
				System.out.println("もっと小さいです");
			}
			if (nu < ran) {
				System.out.println("もっと大きいです");
			}
		}
	}
}
