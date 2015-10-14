package com.example.ahmad.programming4u;

/**
 * Created by Ahmad on 7/22/2015.
 */
import java.util.ArrayList;
import java.util.List;

//import com.example.code.ListLanguage.MyListAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Cplusplus extends Activity {
    private List<CplusplusLanguage> myCplusplusLanguage = new ArrayList<CplusplusLanguage>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cplusplus_main);
        populateLanguageList();
        populateListView();
        //registerClickCallback();
    }




/*
	private void registerClickCallback() {
		// TODO Auto-generated method stub
		ListView list = (ListView)findViewById(R.id.cPlusPlusListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
					long id) {
				// TODO Auto-generated method stub
				switch( position )
			    {
			       case 0:  Intent newActivity = new Intent(ListLanguage.this, C.class);
			                startActivity(newActivity);
			                break;
			       case 1:  Intent newActivity1 = new Intent(ListLanguage.this, Cplusplus.class);
			                startActivity(newActivity1);
			                break;
			       case 2:  Intent newActivity2 = new Intent(ListLanguage.this, C.class);
			                startActivity(newActivity2);
			                break;

			    }
			}

		});
	}


*/

    private void populateLanguageList() {
        // TODO Auto-generated method stub
        myCplusplusLanguage.add(new CplusplusLanguage("Assignments"));
        myCplusplusLanguage.add(new CplusplusLanguage("Projects"));
        myCplusplusLanguage.add(new CplusplusLanguage("other"));
    }

    private void populateListView() {
        ArrayAdapter<CplusplusLanguage> adapter = new MyListAdapter();
        ListView list = (ListView)findViewById(R.id.cPlusPlusListView);
        list.setAdapter(adapter);

    }
    private class MyListAdapter extends ArrayAdapter<CplusplusLanguage>{
        public MyListAdapter(){
            super(Cplusplus.this,R.layout.language_view,myCplusplusLanguage);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View itemView = convertView;
            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.all_view,parent,false);
            }
            CplusplusLanguage currentLanguage = myCplusplusLanguage.get(position);

            //ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
            //imageView.setImageResource(currentLanguage.getIconID());
            TextView makeText = (TextView)itemView.findViewById(R.id.txtAllView2);
            makeText.setText(currentLanguage.getCplusplusLanguageList());
            return itemView;
        }
    }







}

