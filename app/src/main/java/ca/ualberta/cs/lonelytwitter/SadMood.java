/*
 * Class Name: SadMood
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
 * Reprsents a sad mood
 * @author Shally
 * @version 1.0
 * @since 1.0
 */
public class SadMood extends Mood {
    private String mymood = "Sad";

    /**
     * Constructs a sad mood
     */
    public SadMood(){
        super();
    }

    /**
     * Constructs a sad mood
     * @param date
     */
    public SadMood( Date date ){
        super(date);
    }

    /**
     * Returns the current mood
     * @return current mood
     */
    @Override
    public String getMood() {
        return mymood;
    }

}
