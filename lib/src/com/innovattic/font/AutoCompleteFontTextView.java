package com.innovattic.font;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

import com.innovattic.font.TypefaceManager.DrawCallback;

public class AutoCompleteFontTextView extends AutoCompleteTextView
{
	
	public AutoCompleteFontTextView(Context context)
	{
		this(context, null);
	}
	
	public AutoCompleteFontTextView(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.autoCompleteTextViewStyle);
	}
	
	public AutoCompleteFontTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
	private final DrawCallback drawCallback = new DrawCallback() {
		@SuppressLint("WrongCall")
		@Override public void onDraw(Canvas canvas) {
			AutoCompleteFontTextView.super.onDraw(canvas);
		}
	};
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		TypefaceManager.onDrawHelper(canvas, this, drawCallback);
		super.onDraw(canvas);
	}
	
}
