package com.example.appbank;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton =(Button)findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, ListsView.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
    }
}