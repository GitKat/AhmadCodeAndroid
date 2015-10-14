package com.example.ahmad.programming4u;

/**
 * Created by Ahmad on 7/22/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class J extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_list_view);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.javaList));
        ListView lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                    long id) {
                // TODO Auto-generated method stub
                switch( position )
                {  // numbers program......add two numbers, largest number, prime factor
                    case 0:  Intent newActivity = new Intent(J.this, ShowJavaCode.class);
                        newActivity.putExtra("position",0);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity1 = new Intent(J.this, ShowJavaCode.class);
                        newActivity1.putExtra("position",1);
                        startActivity(newActivity1);
                        break;


                    case 2:  Intent newActivity2 = new Intent(J.this, ShowJavaCode.class);
                        newActivity2.putExtra("position",2);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(J.this, ShowJavaCode.class);
                        newActivity3.putExtra("position",3);
                        startActivity(newActivity3);
                        break;


                    case 4:  Intent newActivity4 = new Intent(J.this, ShowJavaCode.class);
                        newActivity4.putExtra("position",4);
                        startActivity(newActivity4);
                        break;
                    case 5:  Intent newActivity5 = new Intent(J.this, ShowJavaCode.class);
                        newActivity5.putExtra("position",5);
                        startActivity(newActivity5);
                        break;


                    case 6:  Intent newActivity6 = new Intent(J.this, ShowJavaCode.class);
                        newActivity6.putExtra("position",6);
                        startActivity(newActivity6);
                        break;
                    case 7:  Intent newActivity7 = new Intent(J.this, ShowJavaCode.class);
                        newActivity7.putExtra("position",7);
                        startActivity(newActivity7);
                        break;
                    case 8:  Intent newActivity8 = new Intent(J.this, ShowJavaCode.class);
                        newActivity8.putExtra("position",8);
                        startActivity(newActivity8);
                        break;
                    case 9:
                        Intent newActivity9 = new Intent(J.this, ShowJavaCode.class);
                        newActivity9.putExtra("position",9);
                        startActivity(newActivity9);
                        break;


                    case 10:  Intent newActivity10 = new Intent(J.this, ShowJavaCode.class);
                        newActivity10.putExtra("position",10);
                        startActivity(newActivity10);
                        break;
                }
            }

        });
    }
}

