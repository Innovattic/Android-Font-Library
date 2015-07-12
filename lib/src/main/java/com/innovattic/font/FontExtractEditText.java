package com.innovattic.font;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.inputmethodservice.ExtractEditText;
import android.util.AttributeSet;

import com.innovattic.font.TypefaceManager.DrawCallback;

@TargetApi(3)
public class FontExtractEditText extends ExtractEditText
{
	
	public FontExtractEditText(Context context)
	{
		this(context, null);
	}
	
	public FontExtractEditText(Context context, AttributeSet attrs)
	{
		this(context, attrs, android.R.attr.editTextStyle);
	}
	
	public FontExtractEditText(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		if (!isInEditMode())
			TypefaceManager.applyFont(this, attrs, defStyle);
	}
	
	private final DrawCallback drawCallback = new DrawCallback() {
		@SuppressLint("WrongCall")
		@Override public void onDraw(Canvas canvas) {
			FontExtractEditText.super.onDraw(canvas);
		}
	};
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		TypefaceManager.onDrawHelper(canvas, this, drawCallback);
		super.onDraw(canvas);
	}
	
}
