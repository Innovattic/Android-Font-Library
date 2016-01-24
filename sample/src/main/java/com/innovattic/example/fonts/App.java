package com.innovattic.example.fonts;

import android.app.Application;

import com.innovattic.font.TypefaceManager;

public class App extends Application
{
	
	@Override
	public void onCreate()
	{
		super.onCreate();
		TypefaceManager.initialize(this, R.xml.fonts);
	}
	
}
