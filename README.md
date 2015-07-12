Android-Font-Library
========================

This is a library that makes it easy for you to add custom fonts to your Android
application. For a detailed description of why we made this library and how it
works, please read
[this blogpost](http://blog.innovattic.com/integrating-fonts-in-android/). For
those that want a quickstart, read on below.

Usage
-----

To use the library, add it to your project (more on that later) and initialize
the TypefaceManager before you make use of any custom font. If you do, the
library will not find out about your mistake untill it is requested to actually
apply a custom font or if you try to get an instance of the TypefaceManager (it
will throw an IllegalStateException, explaining what you should do to fix it).

If you initialized the TypefaceManager, you can start using the newly available
font attributes in your layout xml files. For example, declare a layout like
this:

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:app="http://schemas.android.com/apk/res-auto"
	android:orientation="vertical"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	android:layout_gravity="center_vertical"
	android:gravity="center_horizontal" >

	<com.innovattic.font.FontTextView
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:text="I am a text view with the font aspergit"
		app:font="aspergit" />

	<com.innovattic.font.FontTextView
		style="@style/AspergitStyle"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:text="I am a bold-italic text view with the font aspergit"
		android:textStyle="bold|italic" />

</LinearLayout>
```

Using a style like this:

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources xmlns:android="http://schemas.android.com/apk/res/android" >

	<style name="AspergitStyle">
		<item name="font">aspergit</item>
	</style>

</resources>
```

Adding the library to your project
----------------------------------

There are many ways to accomplish this. You can checkout the library at any
place on your machine and then reference to the library. That is probably the
easiest. You can also include this library as a submodule in your application
project.

Add the library module by editing your settings.gradle file in your project root
to also include the module `:<submodule>:lib`, hit the button 'Sync Project with
Gradle Files' and then add the library as a Module Dependency to your app
module.
