package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

import com.innovattic.util.TypefaceManager;

public class AutoCompleteFontTextView extends AutoCompleteTextView
{
	
	public AutoCompleteFontTextView(Context context)
	{
		this(context, null);
	}
	
	public AutoCompleteFontTextView(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.autoCompleteTextViewStyle);
	}
	
	public AutoCompleteFontTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
