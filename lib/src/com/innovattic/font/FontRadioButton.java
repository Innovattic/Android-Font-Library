package com.innovattic.font;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.innovattic.font.TypefaceManager.DrawCallback;

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
	
	private final DrawCallback drawCallback = new DrawCallback() {
		@SuppressLint("WrongCall")
		@Override public void onDraw(Canvas canvas) {
			FontRadioButton.super.onDraw(canvas);
		}
	};
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		TypefaceManager.onDrawHelper(canvas, this, drawCallback);
		super.onDraw(canvas);
	}
	
}
