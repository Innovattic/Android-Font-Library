package com.innovattic.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.util.AttributeSet;

import com.innovattic.util.TypefaceManager;

@TargetApi(3)
public class FontExtractEditText extends ExtractEditText
{
	
	public FontExtractEditText(Context context)
	{
		this(context, null);
	}
	
	public FontExtractEditText(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.editTextStyle);
	}
	
	public FontExtractEditText(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
