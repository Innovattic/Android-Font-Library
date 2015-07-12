package com.innovattic.font;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ToggleButton;

import com.innovattic.font.TypefaceManager.DrawCallback;

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
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
	private final DrawCallback drawCallback = new DrawCallback() {
		@SuppressLint("WrongCall")
		@Override public void onDraw(Canvas canvas) {
			FontToggleButton.super.onDraw(canvas);
		}
	};
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		TypefaceManager.onDrawHelper(canvas, this, drawCallback);
		super.onDraw(canvas);
	}
	
}
