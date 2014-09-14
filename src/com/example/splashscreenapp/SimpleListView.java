package com.example.splashscreenapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListView extends Activity {
  
  private ListView mainListView;
  private ArrayAdapter<String> listAdapter;
  
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    mainListView = (ListView) findViewById(R.id.mainListView);
    String[] planets = new String[] {"Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8", "Item9", "Item10", "Item11", "Item12", "Item13", "Item14", "Item15", "Item16", "Item17", "Item18", "Item19", "Item20"};  
    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, planets);
    mainListView.setAdapter(listAdapter);      
  }
}