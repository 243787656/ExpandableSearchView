package com.reversible.expandablesearchview;

import android.app.Application;

import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class BaseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Timber.plant(new DebugTree());
	}
}
