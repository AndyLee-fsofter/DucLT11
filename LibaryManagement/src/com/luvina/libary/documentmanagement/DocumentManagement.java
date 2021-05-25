package com.luvina.libary.documentmanagement;

import java.util.ArrayList;
import com.luvina.libary.entities.Book;
import com.luvina.libary.entities.Document;

public class DocumentManagement {
	private ArrayList<Document> documents;
	
	public void inputDocument(Document document) {
		documents.add(document);
	}
	
	public void displayAllDocument() {
		for (int i = 0; i < documents.size(); i++) {
			System.out.println(documents.get(i).toString());
		}
	}
	
	public void displayAllBook() {
		for (int i = 0; i < documents.size(); i++) {
			if (documents.get(i) instanceof Book) {
				System.out.println(documents.get(i).toString());
			}
		}
	}
	
	public void searchBookById(int id) {
		for (int i = 0; i < documents.size(); i++) {
			if (documents.get(i).getDocumentId() == id) {
				if (documents.get(i) instanceof Book) {
					System.out.println(documents.get(i));
				}
			}
		}
	}

}
