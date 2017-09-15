package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Shally on 2017-09-14.
 */

public class SadMood extends Mood {
    private String mymood = "Sad";
    public SadMood(){
        super();
    }

    public SadMood( Date date ){
        super(date);
    }

    @Override
    public String getMood() {
        return mymood;
    }

}
