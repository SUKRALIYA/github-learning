package com.example.sqlitedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;

    MyDbHandler myDbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         myDbHandler= new MyDbHandler(getApplicationContext(),"userdb",null,1);
         Temp.setMyDbHandler(myDbHandler);

         b1=findViewById(R.id.adduser);
         b2=findViewById(R.id.delete_user);
         b3=findViewById(R.id.view_user);
         b4=findViewById(R.id.update_user);

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,InsertUser.class));
             }
         });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
