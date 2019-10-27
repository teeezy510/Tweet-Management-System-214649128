package model;

import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.api.TweetsResources;
import twitter4j.conf.ConfigurationBuilder;




public class twitterinfo {
	
	public List<Status> displayTweets() throws TwitterException
	{
		twitter4j.Twitter twitter = config().getInstance();
		//bean.tweet_bean b_obj = new bean.tweet_bean();
		List<Status> status=twitter.getHomeTimeline();
		for(Status s:status)
		{
			System.out.println(s.getUser().getName()+"                         "+s.getText());
		//b_obj.setUser(s.getUser().getName());
		//b_obj.setMessage(s.getText());
		}
		return status;
	}
	
	public static void main(String[] args) throws TwitterException
	{
		
		
		
		
		//sendTweet("Hi my Ndivhu");
	}
	
	public static Status sendTweet(String text) throws TwitterException
	{
		Status status = null;
		twitter4j.Twitter twitter = config().getInstance();
		
		
		
		status = twitter.updateStatus(text);
		
		System.out.println("successfully updated the status to ["+ status.getText() +"].");
		return status;
	}
	
	public static TwitterFactory config()
	
	{
		ConfigurationBuilder configB = new ConfigurationBuilder();
		configB.setDebugEnabled(true)
		.setOAuthConsumerKey("bwuzutlOzOnscK3bPcvaEp8Mk")
		.setOAuthConsumerSecret("Ml61ABNAjrjIaNE5p7PTXB6jfRZDIncJt6JpVGGjSqtvo8vUNQ")
		.setOAuthAccessToken("1179028425509486592-fimu17xMcD16s7KGYHpragz9v0fbEk")
		.setOAuthAccessTokenSecret("1ZbdRvUSTxNWgidc3tm6TxuYlDAoySH4mmVKtMErlKFFL");
		
		TwitterFactory tf = new TwitterFactory(configB.build());
		return tf;
	}
	
	

}
