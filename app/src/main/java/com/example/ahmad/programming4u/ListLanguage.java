package com.example.ahmad.programming4u;

/**
 * Created by Ahmad on 7/22/2015.
 */
import java.util.ArrayList;
import java.util.List;

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

public class ListLanguage extends Activity {
    private List<language> myLanguage = new ArrayList<language>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateLanguageList();
        populateListView();
        registerClickCallback();
    }




    private void registerClickCallback() {
        // TODO Auto-generated method stub
        ListView list = (ListView)findViewById(R.id.languageListView);
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
                    case 1:  Intent newActivity1 = new Intent(ListLanguage.this, J.class);
                        startActivity(newActivity1);
                        break;
                    case 2:  Intent newActivity2 = new Intent(ListLanguage.this, dataStructure.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3= new Intent(ListLanguage.this,oop.class);
                        startActivity(newActivity3);
                        break;

                }
            }

        });
    }

    private void populateLanguageList() {
        // TODO Auto-generated method stub
     myLanguage.add(new language("C language",R.drawable.c));
        //myLanguage.add(new language("C++ language",R.drawable.cplusplus));
        myLanguage.add(new language("JAVA",R.drawable.abc));
        myLanguage.add(new language("Data Structures",R.drawable.ds));
        myLanguage.add(new language("Object Oriented",R.drawable.oop));

    }

    private void populateListView() {
        ArrayAdapter<language> adapter = new MyListAdapter();
        ListView list = (ListView)findViewById(R.id.languageListView);
        list.setAdapter(adapter);

    }
    private class MyListAdapter extends ArrayAdapter<language>{
        public MyListAdapter(){
            super(ListLanguage.this,R.layout.language_view,myLanguage);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View itemView = convertView;
            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.language_view,parent,false);
            }
            language currentLanguage = myLanguage.get(position);

            ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
            imageView.setImageResource(currentLanguage.getIconID());
            TextView makeText = (TextView)itemView.findViewById(R.id.txtLanguage);
            makeText.setText(currentLanguage.getLanguageName());
            return itemView;
        }
    }

}

