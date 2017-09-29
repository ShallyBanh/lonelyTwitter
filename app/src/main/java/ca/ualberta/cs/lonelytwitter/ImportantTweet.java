/*
 * Class Name: ImportantTweet
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
 * Reprsents a Important Tweet
 * @author Shally
 * @version 1.0
 * @since 1.0
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs normal tweet objects
     * @param message -the content of the tweet
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs normal tweet objects
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }


    /**
     * returns if the tweet is important or not
     * @return
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
