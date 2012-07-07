package jp.itacademy.samples.api.collection;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ListCellRenderer;

import jp.itacademy.samples.oop.Book;

public class MapSample {

	public static void main(String[] args) {

		Map<String, Book> books = new HashMap<>();

		Book book = new Book("�{1", "����A", 1200);
		books.put(book.getTitle(), book); //book.getTitle()���A�L�[

		book = new Book("�{2", "����B", 1300);
		books.put(book.getTitle(), book);

		book = new Book("�{3", "����C", 1400);
		books.put(book.getTitle(), book);

		Book hon2 = books.get("�{2");
		System.out.println(hon2);
		
		
	}
}			
				
