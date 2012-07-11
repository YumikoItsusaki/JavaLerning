package jp.itacademy.samples.api.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRederSample {

	public static void main(String[] args) throws Exception {

		try (BufferedReader reader = new BufferedReader(new FileReader(
				"c:/Users/itacademy/input.txt"))) {

			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		}
	}
}
