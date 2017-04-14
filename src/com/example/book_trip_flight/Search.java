package com.example.book_trip_flight;




import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Search extends Activity {
	Spinner sp,spin2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		sp=(Spinner)findViewById(R.id.travellers);
		spin2=(Spinner)findViewById(R.id.class1);
		
		ArrayAdapter<CharSequence>ar=ArrayAdapter.createFromResource(this,
				R.array.Travellers,android.R.layout.simple_list_item_1);
		
		ar.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
	
		sp.setAdapter(ar);
		
		
		ArrayAdapter<CharSequence>a=ArrayAdapter.createFromResource(this,
				R.array.class1,android.R.layout.simple_list_item_1);
		
		ar.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		sp.setAdapter(a);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}

}
