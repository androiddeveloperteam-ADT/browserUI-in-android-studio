package com.example.browser_ui;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] maintitle ={"News","Updates","Headlines","Stock","New","Trending","viral","Earn","Videos"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListView adapter=new MyListView(this, maintitle);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Toast.makeText(getApplicationContext(),"First Option",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    Toast.makeText(getApplicationContext(),"Second Option",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Third Option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Forth Option",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Fifth Option",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
