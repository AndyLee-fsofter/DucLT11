package com.luvina.ex3.users;

import com.luvina.ex3.topic.Jokes;

public class Main {
	public static void main(String[] args) {
		Jokes joke1 = new Jokes();
		joke1.inputJoke(1,"3 idiot", "DucLT","12/03/2019", "có 3 thằng ngốc...");
		joke1.readJoke(1);
	}

}
