package com.alu.Launcher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LauncherMain extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b = (Button) findViewById(R.id.clickme);
        b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Log.i("LauncherMain", "log");
				Intent i = new Intent();
				i.setComponent(new ComponentName("com.alu.Launched", "com.alu.Launched.LaunchedMain"));
				LauncherMain.this.startActivity(i);
			}
        	
        });
    }
}