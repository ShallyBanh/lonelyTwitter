package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TextView editTweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        String editTweetText = getIntent().getExtras().getString("editingTweet");
        editTweet = (TextView) findViewById(R.id.edit);
        editTweet.setText(editTweetText);
    }

}
