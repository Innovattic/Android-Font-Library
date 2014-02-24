package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

import com.innovattic.util.TypefaceManager;

public class MultiAutoCompleteFontTextView extends MultiAutoCompleteTextView
{
	
	public MultiAutoCompleteFontTextView(Context context)
	{
		this(context, null);
	}
	
	public MultiAutoCompleteFontTextView(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.autoCompleteTextViewStyle);
	}
	
	public MultiAutoCompleteFontTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
