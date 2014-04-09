package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

import com.innovattic.util.TypefaceManager;

public class FontCheckBox extends CheckBox
{
	
	public FontCheckBox(Context context)
	{
		this(context, null);
	}
	
	public FontCheckBox(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.checkboxStyle);
	}
	
	public FontCheckBox(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
