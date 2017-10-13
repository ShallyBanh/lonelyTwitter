package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Shally on 2017-10-12.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        //assertTrue(Boolean.FALSE);
    }

    public void testDelete(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.addTweet(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void testHasTweets(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }
    
     public void testGetTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }
    
    public void testTweetCount(){
        TweetList list = new TweetList();
        assertEquals(list.getCount(), 0);
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertEquals(list.getCount(), 1);
    }

}
