package com.empireofchaos.wine_o;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void gotoDataCollection(View view){
        Intent intent = new Intent(this, DataCollection.class);
        startActivity(intent);
    }

    public void gotoDrinkingHistory(View view){
        Intent intent = new Intent(this, DrinkingHistory.class);
        startActivity(intent);
    }

    public void gotoRecommendWine(View view){
        Intent intent = new Intent(this, RecommendWine.class);
        startActivity(intent);
    }

    public void gotoTrendingWine(View view){
        Intent intent = new Intent(this, TrendingWine.class);
        startActivity(intent);
    }

}
