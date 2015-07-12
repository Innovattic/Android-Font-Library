package com.innovattic.font;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.Chronometer;

import com.innovattic.font.TypefaceManager.DrawCallback;

public class FontChronometer extends Chronometer
{
	
	public FontChronometer(Context context)
	{
		this(context, null);
	}
	
	public FontChronometer(Context context, AttributeSet attrs)
	{
		this(context, attrs, 0);
	}
	
	public FontChronometer(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
	private final DrawCallback drawCallback = new DrawCallback() {
		@SuppressLint("WrongCall")
		@Override public void onDraw(Canvas canvas) {
			FontChronometer.super.onDraw(canvas);
		}
	};
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		TypefaceManager.onDrawHelper(canvas, this, drawCallback);
		super.onDraw(canvas);
	}
	
}
