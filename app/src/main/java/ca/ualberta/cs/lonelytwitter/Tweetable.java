/*
 * Interface Name: Tweetable
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
 * Tweet Interface
 * @author Shally
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public interface Tweetable {
    /**
     * interface to get content of tweet
     * @return
     */
    //Refactor 2: Unnecessary interface modifier. public is redundant for interface methods
    String getMessage();

    /**
     * interface to get the date of the tweet
     * @return
     */
    //Refactor 3: Unnecessary interface modifier. public is redundant for interface methods
    Date getDate();
}
