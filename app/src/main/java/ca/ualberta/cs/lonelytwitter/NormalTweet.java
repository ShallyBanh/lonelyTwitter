/*
 * Class Name: NormalTweet
 *
 * Version: version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta, All Rights Reserved, You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Reprsents a Normal Tweet
 * @author Shally
 * @version 1.0
 * @since 1.0
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs normal tweet objects
     * @param message -the content of the tweet
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs normal tweet objects
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * returns if the tweet is important or not
     * @return
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
