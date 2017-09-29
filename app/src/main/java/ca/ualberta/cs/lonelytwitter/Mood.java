/*
 * Class Name: Mood
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
 * Reprsents a mood
 * @author Shally
 * @version 1.0
 * @since 1.0
 * @see SadMood
 * @see HappyMood
 */
public abstract class Mood {
    private Date date;

    /**
     * Constructs a mood
     *
     */
    public Mood(){
        this.date = new Date();
    }

    /**
     * Constructs a mood
     * @param date
     */
    public Mood( Date date ){
        this.date = date;
    }

    /**
     * Gets the current date
     * @return
     */
    public Date getDate(){
        return this.date;
    }

    /**
     * Sets the date of the tweet to date
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * gets the mood - abstract
     * @return
     */
    public abstract String getMood();

}
