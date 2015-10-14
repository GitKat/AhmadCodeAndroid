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

public class C extends Activity {
    private List<Clanguage> myCLanguage = new ArrayList<Clanguage>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_main);
        populateLanguageList();
        populateListView();
        registerClickCallback();
    }

    private void registerClickCallback() {
        // TODO Auto-generated method stub
        ListView list = (ListView)findViewById(R.id.cListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                    long id) {
                // TODO Auto-generated method stub
                switch( position )
                {// Assignment , tutoriaal , If else, swapping ,number , matrix, sorting


                    case 0:  Intent newActivity = new Intent(C.this, Cdisplay.class);
                        newActivity.putExtra("position",0);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity1 = new Intent(C.this, Cdisplay.class);
                        newActivity1.putExtra("position",1);
                        startActivity(newActivity1);
                        break;
                    case 2:  Intent newActivity2 = new Intent(C.this, Cdisplay.class);
                        newActivity2.putExtra("position",2);
                        startActivity(newActivity2);
                        break;

                    case 3:  Intent newActivity3 = new Intent(C.this, Cdisplay.class);
                        newActivity3.putExtra("position",3);
                        startActivity(newActivity3);
                        break;
                    case 4:  Intent newActivity4 = new Intent(C.this, Cdisplay.class);
                        newActivity4.putExtra("position",4);
                        startActivity(newActivity4);
                        break;
                    case 5:  Intent newActivity5 = new Intent(C.this, Cdisplay.class);
                        newActivity5.putExtra("position",5);
                        startActivity(newActivity5);
                        break;
                    case 6:  Intent newActivity6 = new Intent(C.this, Cdisplay.class);
                        newActivity6.putExtra("position",6);
                        startActivity(newActivity6);
                        break;
                    case 7:  Intent newActivity7 = new Intent(C.this, Cdisplay.class);
                        newActivity7.putExtra("position",7);
                        startActivity(newActivity7);
                        break;
                    case 8:  Intent newActivity8 = new Intent(C.this, Cdisplay.class);
                        newActivity8.putExtra("position",8);
                        startActivity(newActivity8);
                        break;
                    case 9:  Intent newActivity9 = new Intent(C.this, Cdisplay.class);
                        newActivity9.putExtra("position",9);
                        startActivity(newActivity9);
                        break;
                    case 10:  Intent newActivity10 = new Intent(C.this, Cdisplay.class);
                        newActivity10.putExtra("position",10);
                        startActivity(newActivity10);
                        break;
                    case 11:  Intent newActivity11 = new Intent(C.this, Cdisplay.class);
                        newActivity11.putExtra("position",11);
                        startActivity(newActivity11);
                        break;
                    case 12:  Intent newActivity12 = new Intent(C.this, Cdisplay.class);
                        newActivity12.putExtra("position",12);
                        startActivity(newActivity12);
                        break;
                }
            }

        });
    }




    private void populateLanguageList() {

        // TODO Auto-generated method stub
        myCLanguage.add(new Clanguage("Assignments"));
        myCLanguage.add(new Clanguage("Numbers"));
        myCLanguage.add(new Clanguage("Arrays"));
        myCLanguage.add(new Clanguage("Sorting"));
        myCLanguage.add(new Clanguage("Matrix"));
        myCLanguage.add(new Clanguage("Swapping"));
        myCLanguage.add(new Clanguage("Strings"));
        myCLanguage.add(new Clanguage("Conversions"));
        myCLanguage.add(new Clanguage("Complex"));
        myCLanguage.add(new Clanguage("LCM HCF and GCD"));
        myCLanguage.add(new Clanguage("Searching"));
        myCLanguage.add(new Clanguage("Games"));
        myCLanguage.add(new Clanguage("Projects"));





    }

    private void populateListView() {
        ArrayAdapter<Clanguage> adapter = new MyListAdapter();
        ListView list = (ListView)findViewById(R.id.cListView);
        list.setAdapter(adapter);

    }
    private class MyListAdapter extends ArrayAdapter<Clanguage>{
        public MyListAdapter(){
            super(C.this,R.layout.all_view,myCLanguage);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View itemView = convertView;
            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.all_view,parent,false);
            }
            Clanguage currentLanguage = myCLanguage.get(position);

            //ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
            //imageView.setImageResource(currentLanguage.getIconID());
            TextView makeText = (TextView)itemView.findViewById(R.id.txtAllView2);
            makeText.setText(currentLanguage.getClanguagelist());
            return itemView;
        }
    }





}
