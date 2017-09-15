package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Shally on 2017-09-14.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public String getMessage(){
        return this.message;
    }

    public abstract Boolean isImportant();

}
