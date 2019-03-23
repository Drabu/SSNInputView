SSNInputView
========

A Custom layout that allows you to format social security number automatically to the default pattern.


Configuration
-------------

Add it in your root build.gradle at the end of repositories:

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


Add the dependency: 

    dependencies {
	        implementation 'com.github.Drabu:SSNInputView:1.0.1'
	 }
   


#Example XMML: 

     <com.oneclickaway.opensource.ssninputview.SSNInputView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />


Usage
-----
-Puts hypons and groups ssn number automatically as per the format provided by US.


