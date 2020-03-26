package com.books;

import java.util.ArrayList;
import java.util.List;

public class Books {
	public List<BooksData> bookList;
	
	public Books()
	{
		bookList = new ArrayList<BooksData>();
		bookList.add(new BooksData("001","Head First Java","Oracle","2017","700","Kathy Sierra"));	
		bookList.add(new BooksData("002","OCA","Mc Graw Hill","2007","500","Bert Bates"));
		bookList.add(new BooksData("003","The Complete Java Refrence","Mc Graw Hill","E6","1000","Prajakta"));
		bookList.add(new BooksData("004","Think and Grow","Navneet","2009","500","Nepolian"));
		bookList.add(new BooksData("005","Effective Java","O'Reilly","2019","1350","Joshua Bloch"));
		bookList.add(new BooksData("006","Java Puzzlers","Google Books","2020","1100","Neal Gafter"));
	}
	
	

}
