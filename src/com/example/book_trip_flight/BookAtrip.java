package com.example.book_trip_flight;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BookAtrip extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book_atrip);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book_atrip, menu);
		return true;
	}

}
