package com.innovattic.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Switch;

import com.innovattic.util.TypefaceManager;

@TargetApi(14)
public class FontSwitch extends Switch
{
	
	public FontSwitch(Context context)
	{
		this(context, null);
	}
	
	public FontSwitch(Context context, AttributeSet attrs)
	{
		// The switchStyle is not available in android.R.attr, so let's call the
		// super constructor from here and apply the font with that style.
		super(context, attrs);
		TypefaceManager.applyFont(this, attrs, 0);
	}
	
	public FontSwitch(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
