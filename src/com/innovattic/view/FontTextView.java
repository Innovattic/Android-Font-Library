package com.innovattic.view;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.innovattic.example.fonts.R;
import com.innovattic.util.TypefaceManager;

public class FontTextView extends TextView
{

	@SuppressWarnings("unused")
	private static final String TAG = FontTextView.class.getSimpleName();

	public FontTextView(Context context)
	{
		super(context);
		applyFont(this, null, android.R.attr.textViewStyle);
	}

	public FontTextView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		applyFont(this, attrs, android.R.attr.textViewStyle);
	}

	public FontTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		applyFont(this, attrs, defStyle);
	}
	
	public static void applyFont(TextView target, AttributeSet attrs, int defStyle)
	{
		// By default, the font is not changed
		String font = null;
		// By default, we apply a regular typeface
		int style = Typeface.NORMAL;
		
		// First get the font attribute from the textAppearance:
		Theme theme = target.getContext().getTheme();
		// Get the text appearance that's currently in use
		TypedArray a = theme.obtainStyledAttributes(attrs,
			new int[] {android.R.attr.textAppearance}, defStyle, 0);
		int textAppearanceStyle = a.getResourceId(0, -1);
		a.recycle();
		// Get the font and style defined in the text appearance
		TypedArray appearance = null;
		if (textAppearanceStyle != -1)
			appearance = theme.obtainStyledAttributes(textAppearanceStyle,
				R.styleable.Fonts);
		if (appearance != null)
		{
			// Iterate over all attributes in 'Android-style'
			// (similar to the implementation of the TextView constructor)
			int n = appearance.getIndexCount();
			for (int i = 0; i < n; i++)
			{
				int attr = appearance.getIndex(i);
				switch (attr)
				{
					case R.styleable.Fonts_font:
	                    font = appearance.getString(attr);
	                    break;
	                    
					case R.styleable.Fonts_android_textStyle:
						style = appearance.getInt(attr, Typeface.NORMAL);
						break;
				}
			}
			appearance.recycle();
		}
		
		// Then get the font attribute from the FontTextView itself:
		a = theme.obtainStyledAttributes(attrs,
			R.styleable.Fonts, defStyle, 0);
		int n = a.getIndexCount();
		for (int i = 0; i < n; i++)
		{
			int attr = a.getIndex(i);
			switch (attr)
			{
				case R.styleable.Fonts_font:
					font = a.getString(attr);
					break;
					
				case R.styleable.Fonts_android_textStyle:
					style = a.getInt(attr, Typeface.NORMAL);
					break;
			}
		}
		a.recycle();
		
		// Now we have the font, apply it
		if (font == null)
			return;
		TypefaceManager.getInstance().setTypeface(target, font, style);
		a.recycle();
	}
	
}
