package com.innovattic.view;

import com.innovattic.util.TypefaceManager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class FontButton extends Button
{
	
	public FontButton(Context context)
	{
		this(context, null);
	}
	
	public FontButton(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.buttonStyle);
	}
	
	public FontButton(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
