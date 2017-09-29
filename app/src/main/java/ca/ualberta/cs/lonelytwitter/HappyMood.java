/*
 * Class Name: HappyMood
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
 * Reprsents a Happy mood
 * @author Shally
 * @version 1.0
 * @since 1.0
 */
public class HappyMood extends Mood {
    private String mymood = "Happy";

    /**
     * Constructs a happy mood
     */
    public HappyMood(String mood){
        super();
    }

    /**
     * Constructs a happy mood
     * @param mood
     * @param date
     */
    public HappyMood(String mood, Date date){
        super(date);
    }

    /**
     * Returns the current mood
     * @return current mood
     */
    @Override
    public String getMood(){
        return mymood;
    }
}
