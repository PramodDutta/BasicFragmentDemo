package com.witmergers.customfragmentdemo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        int screenConfig = getResources().getConfiguration().orientation;

        if(screenConfig == Configuration.ORIENTATION_PORTRAIT)
        {
            FragementOne fragment = new FragementOne();
            //Log.d("ID1","id 1"+R.id.framgment_1);
            fragmentTransaction.replace(android.R.id.content, fragment);


        }
        else if(screenConfig == Configuration.ORIENTATION_LANDSCAPE)
        {
            FragementTwo fragment = new FragementTwo();
            //Log.d("ID2","id 2"+R.id.framgment_2);
            fragmentTransaction.replace(android.R.id.content, fragment);


        }
        fragmentTransaction.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
