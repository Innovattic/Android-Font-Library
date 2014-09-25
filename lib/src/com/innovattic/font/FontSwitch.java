package com.innovattic.font;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.Switch;

import com.innovattic.font.TypefaceManager.DrawCallback;

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
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, 0);
	}
	
	public FontSwitch(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
	private final DrawCallback drawCallback = new DrawCallback() {
		@SuppressLint("WrongCall")
		@Override public void onDraw(Canvas canvas) {
			FontSwitch.super.onDraw(canvas);
		}
	};
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		TypefaceManager.onDrawHelper(canvas, this, drawCallback);
		super.onDraw(canvas);
	}
	
}
