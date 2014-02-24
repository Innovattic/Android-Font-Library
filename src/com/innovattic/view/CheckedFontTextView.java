package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

import com.innovattic.util.TypefaceManager;

public class CheckedFontTextView extends CheckedTextView
{
	
	public CheckedFontTextView(Context context)
	{
		this(context, null);
	}
	
	public CheckedFontTextView(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.textViewStyle);
	}
	
	public CheckedFontTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
