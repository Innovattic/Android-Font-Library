package com.innovattic.font;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;

import com.innovattic.font.TypefaceManager.DrawCallback;

public class FontCheckBox extends AppCompatCheckBox
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
	
	private final DrawCallback drawCallback = new DrawCallback() {
		@SuppressLint("WrongCall")
		@Override public void onDraw(Canvas canvas) {
			FontCheckBox.super.onDraw(canvas);
		}
	};
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		TypefaceManager.onDrawHelper(canvas, this, drawCallback);
		super.onDraw(canvas);
	}
	
}
