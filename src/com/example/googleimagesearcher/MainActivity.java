package com.example.googleimagesearcher;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final int REQUEST_CODE = 77;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onSubmit(View v) {
		EditText image = (EditText) findViewById(R.id.etSearch);
		Toast.makeText(getApplicationContext(), "Searching for " + 
				image.getText().toString() + "...", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onSettingsAction(MenuItem mi) {
		Toast.makeText(getApplicationContext(), "Menu clicked...", Toast.LENGTH_SHORT).show();
		Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
		i.putExtra("mode", 2);
		startActivityForResult(i, REQUEST_CODE);
	}
}
