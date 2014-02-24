package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Chronometer;

import com.innovattic.util.TypefaceManager;

public class FontChronometer extends Chronometer
{
	
	public FontChronometer(Context context)
	{
		this(context, null);
	}
	
	public FontChronometer(Context context, AttributeSet attrs)
	{
		this(context, attrs, 0);
	}
	
	public FontChronometer(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
