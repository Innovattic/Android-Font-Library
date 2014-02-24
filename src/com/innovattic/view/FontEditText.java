package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.innovattic.util.TypefaceManager;

public class FontEditText extends EditText
{
	
	public FontEditText(Context context)
	{
		this(context, null);
	}
	
	public FontEditText(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.editTextStyle);
	}
	
	public FontEditText(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
