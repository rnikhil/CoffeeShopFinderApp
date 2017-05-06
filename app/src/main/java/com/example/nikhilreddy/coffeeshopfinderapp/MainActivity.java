package com.example.nikhilreddy.coffeeshopfinderapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String coffee [] = {"Blue Bottle Coffee", "Cafe Du Monde", "La Colombe Torrefaction", "Stumptown Coffee Roasters"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.txtCoffeeFinder, coffee));
    }
    protected void onListItemClick(ListView lv, View v, int position, long id)
    {
        switch (position)
        {
            case 0:startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://bluebottlecoffee.com/")));break;
            case 1:startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cafedumonde.com/")));break;
            case 2:startActivity(new Intent(MainActivity.this, TorrefactionActivity.class));break;
            case 3:startActivity(new Intent(MainActivity.this, StumptownActivity.class));break;
        }

    }
}
