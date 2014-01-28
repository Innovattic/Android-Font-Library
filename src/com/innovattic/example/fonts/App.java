package com.innovattic.example.fonts;

import com.innovattic.util.TypefaceManager;

import android.app.Application;

public class App extends Application
{
	
	@Override
	public void onCreate()
	{
		super.onCreate();
		TypefaceManager.initialize(this, R.xml.fonts);
	}
	
}
