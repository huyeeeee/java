package assignment20200301;

import java.util.ArrayList;

public class TweetFeed {
	private String screenName;
	private ArrayList<Tweet> tweets;
	private final int INITIAL_CAPACITY = 100;


	public TweetFeed(String screenName){
		this.screenName = screenName;
		this.tweets = new ArrayList<>(INITIAL_CAPACITY);
	}

	public String getScreenName() {
		return screenName;
	}
}
