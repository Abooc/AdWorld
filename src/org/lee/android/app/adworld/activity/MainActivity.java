package org.lee.android.app.adworld.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.lee.android.app.adworld.R;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Purchase:
                return true;
            case R.id.About:
                AboutActivity.launch(this);
                return true;
            case R.id.pingfen:
                return true;
            case R.id.Share:
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
