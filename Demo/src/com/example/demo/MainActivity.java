package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;

public class MainActivity extends Activity {

	private ListView mListView;
	private ArrayList<HashMap<String,Integer>> mList = new ArrayList<HashMap<String,Integer>>();
	private ArrayList<HashMap<String,Integer>> mGist = new ArrayList<HashMap<String,Integer>>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.listview);
		initData();
		ListViewAdapter adapter = new ListViewAdapter(this, mList,mGist);
		mListView.setAdapter(adapter);
		
		
	}

	public void initData(){
		for(int i = 0;i<5;i++){
			
			HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
			hashmap.put("list", R.drawable.test);
			
			for(int j = 0;j<15;j++){
				
				HashMap<String, Integer> map = new HashMap<String, Integer>();
				map.put("grid", R.drawable.ic_launcher);
				mGist.add(map);
			}
			mList.add(hashmap);
		}
		
		
	}

}
