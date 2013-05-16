package com.marcopolo.phonegap;

import android.os.Bundle;
import android.view.Menu;
import android.view.WindowManager;

import org.apache.cordova.*;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(
				WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN
						| WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
		super.loadUrl(Config.getStartUrl());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
