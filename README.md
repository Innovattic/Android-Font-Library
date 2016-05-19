Android-Font-Library
========================

This is a library that makes it easy for you to add custom fonts to your Android
application. For a detailed description of why we made this library and how it
works, please read
[this blogpost](http://blog.innovattic.com/integrating-fonts-in-android/). For
those that want a quickstart, read on below.

Gradle dependency
-----------------

If you are using the Android Support Library, use this dependency to use font
aware `TextView`'s that extend from their AppCompat versions of the support
library. The support library is not a transitive dependency, so you have to add
it by yourself.
```groovy
compile 'com.innovattic:fontlib-support:5.0.0'
```

Otherwise, use the following variant to use the font aware `TextView`'s that
extend from the native counterparts:
```groovy
compile 'com.innovattic:fontlib-native:5.0.0'
```

Usage
-----

To use the library, add it to your project as a gradle dependency, specify your
[font xml file](sample/src/main/res/xml/fonts.xml), call `TypefaceManager.init()`
(typically in your Application class' `onCreate`) and use any of the font aware
TextViews.

A font xml file is placed in `app/res/xml` and can look like this:

```xml
<?xml version="1.0" encoding="utf-8"?>
<familyset>
	<family>
		<nameset>
			<name>aspergit</name>
			<name>any-alias</name>
		</nameset>
		<fileset>
			<file>aspergit/Aspergit.ttf</file>
			<file>aspergit/Aspergit Bold.ttf</file>
			<file>aspergit/Aspergit Italic.ttf</file>
			<file>aspergit/Aspergit Bold Italic.ttf</file>
		</fileset>
	</family>
</familyset>
```

In your layout xml files, use any of the font aware TextViews and set its
`flFont` attribute to your font's name, like this:

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:app="http://schemas.android.com/apk/res-auto"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	android:gravity="center_vertical"
	android:orientation="vertical">

	<com.innovattic.font.FontTextView
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:text="I am a text view with the font aspergit"
		app:flFont="aspergit" />

	<com.innovattic.font.FontTextView
		style="@style/AspergitStyle"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:text="I am a bold-italic text view with the font aspergit"
		android:textStyle="bold|italic" />

	<com.innovattic.font.FontTextView
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:textAppearance="@style/AspergitTextAppearance"
		android:text="I am a bold text view with the font aspergit" />
		
</LinearLayout>
```

Where the styles used in the last two `FontTextView`'s are defined like this:

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources xmlns:android="http://schemas.android.com/apk/res/android" >

	<style name="AspergitStyle">
		<item name="flFont">aspergit</item>
	</style>

	<style name="AspergitTextAppearance">
		<item name="flFont">aspergit</item>
		<item name="android:textStyle">bold</item>
	</style>

</resources>
```
