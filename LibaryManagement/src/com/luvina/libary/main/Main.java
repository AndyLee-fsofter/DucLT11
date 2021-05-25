package com.luvina.libary.main;

import com.luvina.libary.documentmanagement.DocumentManagement;
import com.luvina.libary.entities.Book;
import com.luvina.libary.entities.Document;

public class Main {

	public static void main(String[] args) {
		Document book1 = new Book();
		DocumentManagement dm = new DocumentManagement();
		dm.inputDocument(book1);
		

	}

}
