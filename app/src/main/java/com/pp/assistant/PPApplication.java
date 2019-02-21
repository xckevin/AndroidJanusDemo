package com.pp.assistant;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

public class PPApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Hack PPApplication", Toast.LENGTH_LONG).show();
        Log.e("HackPPApplication", "PPApplication#onCreate");
    }
}
