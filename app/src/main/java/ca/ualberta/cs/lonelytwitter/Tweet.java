/*
 * Class Name: Tweet
 *
 * Version: version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta, All Rights Reserved, You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 * @author Shally
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    /**
     * Constructs tweet objects
     * @param message -the content of the tweet
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs tweet objects
     *
     * @param message - the content of the tweet
     * @param date - the current date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Sets the date on the tweet
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Gets the current date
     *
     * @return
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets tweet messages
     *
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets the content of the tweet
     *
     * @return
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Gets the current mood
     *
     * @return
     */
    public ArrayList<Mood> getMood(){
        return this.moods;
    }

    /**
     * Sets the mood
     *
     * @param mood
     */
    public void setMood(ArrayList<Mood> mood){
        this.moods = mood;
    }

    /**
     * abstract method
     *
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Returns the date of the tweet as a string
     * @return date of tweet as string
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}
