package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by Shally on 2017-10-12.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void add(Tweet tweet) throws IllegalArgumentException{
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException("duplicate tweet");
        }
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        ArrayList<Tweet> returnTweets =  new ArrayList<Tweet>();
        returnTweets.addAll(tweets);
        Collections.sort(returnTweets, new Comparator<Tweet>() {
                    public int compare(Tweet t1, Tweet t2) {
                        return t1.getDate().compareTo(t2.getDate());
                    }
                }
        );
        return returnTweets;
    }

    public int getCount() {
        return tweets.size();
    }
}
