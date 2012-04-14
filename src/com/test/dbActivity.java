package com.test;

import com.test.db.R;
import com.phonegap.*;
import android.os.Bundle;

public class dbActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
