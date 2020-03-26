package com.books;

public class BooksData {
	private String Book_id;
	private String Book_name;
	private String Book_publication;
	private String Book_Edition;
	private String Book_price;
	private String Book_Autor;
	 
	public BooksData() {}

	public BooksData(String book_id, String book_name, String book_publication, String book_Edition, String book_price,String book_Autor) {
		super();
		Book_id = book_id;
		Book_name = book_name;
		Book_publication = book_publication;
		Book_Edition = book_Edition;
		Book_price = book_price;
		Book_Autor = book_Autor;
	}

	public String getBook_id() {
		return Book_id;
	}

	public void setBook_id(String book_id) {
		Book_id = book_id;
	}

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public String getBook_publication() {
		return Book_publication;
	}

	public void setBook_publication(String book_publication) {
		Book_publication = book_publication;
	}

	public String getBook_Edition() {
		return Book_Edition;
	}

	public void setBook_Edition(String book_Edition) {
		Book_Edition = book_Edition;
	}

	public String getBook_price() {
		return Book_price;
	}

	public void setBook_price(String book_price) {
		Book_price = book_price;
	}

	public String getBook_Autor() {
		return Book_Autor;
	}

	public void setBook_Autor(String book_Autor) {
		Book_Autor = book_Autor;
	}
	
	

}
