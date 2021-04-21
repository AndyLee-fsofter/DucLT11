package com.luvina.ex3.topic;

public class Topic {
	private int topicId;
	private String topicName;
	private Jokes[] joke;
	
	public void createTopic(int topicId, String topicName, Jokes[] joke) {
		this.topicId = topicId;
		this.topicName = topicName;
		this.joke = joke;
	}
	
	public void deleteTopic(int topicID) {
		System.out.println("tìm kiếm và xóa chủ đề theo id truyền vào");
	}
	
	public void searchTopic(int topicId) {
		System.out.println("tìm kiếm chủ đề theo id truyền vào");
		
	}

}
