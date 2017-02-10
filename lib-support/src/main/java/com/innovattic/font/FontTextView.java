package com.innovattic.font;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.innovattic.font.TypefaceManager.DrawCallback;

public class FontTextView extends AppCompatTextView {

	public FontTextView(Context context) {
		this(context, null);
	}

	public FontTextView(Context context, AttributeSet attrs) {
		this(context, attrs, android.R.attr.textViewStyle);
	}

	public FontTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		if (!isInEditMode()) {
			TypefaceManager.applyFont(this, attrs, defStyle);
		}
	}

	private final DrawCallback drawCallback = new DrawCallback() {
		@SuppressLint("WrongCall")
		@Override public void onDrawCall(Canvas canvas) {
			FontTextView.super.onDraw(canvas);
		}
	};

	@Override
	protected void onDraw(Canvas canvas) {
		TypefaceManager.onDrawHelper(canvas, this, drawCallback);
		super.onDraw(canvas);
	}

}
