package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Shally on 2017-09-14.
 */

public class HappyMood extends Mood {
    private String mymood = "Happy";
    public HappyMood(String mood){
        super();
    }

    public HappyMood(String mood, Date date){
        super(date);
    }

    @Override
    public String getMood(){
        return mymood;
    }
}
