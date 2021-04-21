package com.luvina.ex3.topic;


public class Jokes {
	private int jokeId;
	private String jokeName;
	private String author;
	private String publicationDate;
	private String jokeContent;
	

	public void inputJoke(int jokeId, String jokeName, String author,
			String publicationDate, String jokeContent) {
		this.jokeId = jokeId;
		this.jokeName = jokeName;
		this.author = author;
		this.publicationDate = publicationDate;
		this.jokeContent = jokeContent;
	}
	
	public void deleteJoke(int id) {
		System.out.println("tìm kiếm và xóa truyện theo id truyền vào");
	}
	
	public void readJoke(int id) {
		System.out.println("tìm kiếm truyện theo id truyền vào");
		System.out.println("đọc truyện có id :" + id);
		System.out.println(jokeContent);
	}

}
