package com.innovattic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.innovattic.util.TypefaceManager;

public class FontRadioButton extends RadioButton
{
	
	public FontRadioButton(Context context)
	{
		this(context, null);
	}
	
	public FontRadioButton(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.radioButtonStyle);
	}
	
	public FontRadioButton(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
}
