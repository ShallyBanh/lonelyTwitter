/*
 * Class Name: LonelyTwitterActivity
 *
 * Version: version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta, All Rights Reserved, You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Main Activity
 * @author Shally
 * @version 1.0
 * @since 1.0
 */
public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	//Refactor 5: Declaration can have final modifier
	private final ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	//Refactor 1: Removed unused declaration
	private ArrayAdapter<Tweet> adapter;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		clearButton.setOnClickListener(new View.OnClickListener() {
	          public void onClick(View v) {
					tweets.clear();
					adapter.notifyDataSetChanged();
					saveInFile();
	          }
       });

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
				tweets.add(new NormalTweet(text));
				adapter.notifyDataSetChanged();
				saveInFile();
//				Tweet tweet = new ImportantTweet("");
//				NormalTweet tweet1 = new NormalTweet("");
//				try {
//					tweet.setMessage("hello");
//				} catch (TweetTooLongException e) {
//					//e.printStackTrace();
//				}
//				ArrayList<Tweet> tweets = new ArrayList<Tweet>();
//				tweets.add(tweet);
//				tweets.add(tweet1);
//				for(Tweet t : tweets){
//					Log.d("Some Tag", "The isImportant method on this object returns " + t.isImportant());
//				}
//
//				ArrayList<Tweetable> tweetables = new ArrayList<Tweetable>();
//				tweetables.add(tweet);
//				tweetables.add(tweet1);
//				setResult(RESULT_OK);
//				String text = bodyText.getText().toString();
//				saveInFile(text, new Date(System.currentTimeMillis()));
//				//finish();

			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		loadFromFile();
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}

	/**
	 * Loads from a file
	 */
	private void loadFromFile() {
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson();

			Type listType = new TypeToken<ArrayList<Tweet>>(){}.getType();
			tweetList = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tweetList = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}

		//Refactor 4: Removed unused assignment "tweets"
	}

	/**
	 * saves the file
	 */
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);

			OutputStreamWriter writer = new OutputStreamWriter(fos);
			Gson gson = new Gson();
			gson.toJson(tweets, writer);
			writer.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}