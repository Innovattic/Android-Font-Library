package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.innovattic.util.TypefaceManager;

public class FontTextView extends TextView
{
	
	public FontTextView(Context context)
	{
		this(context, null);
	}
	
	public FontTextView(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.textViewStyle);
	}
	
	public FontTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
