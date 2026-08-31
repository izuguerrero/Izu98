package com.izu.iconpack98;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        TextView v = new TextView(this);
        v.setText("IZU 98 ICON PACK\n\nInstalled. Open Lawnchair → Home settings → General → Icon style.");
        v.setTextColor(Color.WHITE);
        v.setBackgroundColor(Color.BLACK);
        v.setTextSize(18);
        v.setGravity(Gravity.CENTER);
        v.setPadding(40,40,40,40);
        setContentView(v);
    }
}
