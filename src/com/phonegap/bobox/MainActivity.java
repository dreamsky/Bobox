package com.phonegap.bobox;

import android.os.Bundle;
/*import android.app.Activity;*/
import org.apache.cordova.*;
/*import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;*/

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/BoBox/index.html");
        /*setContentView(R.layout.activity_main);*/
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/

    
}
