package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

import com.innovattic.util.TypefaceManager;

public class FontToggleButton extends ToggleButton
{
	
	public FontToggleButton(Context context)
	{
		this(context, null);
	}
	
	public FontToggleButton(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.buttonStyleToggle);
	}
	
	public FontToggleButton(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
