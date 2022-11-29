package com.example.appbank;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    EditText loginUsername,loginPassword;
    boolean isAllFieldChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginUsername = (EditText)findViewById(R.id.loginUsername);
        loginPassword = (EditText)findViewById(R.id.loginPassword);
        loginButton =(Button)findViewById(R.id.loginButton);

        /*loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                isAllFieldChecked = fieldsCheck();
                if(isAllFieldChecked) {
                        Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_SHORT).show();
                        Intent activityChangeIntent = new Intent(MainActivity.this, ListsView.class);
                        MainActivity.this.startActivity(activityChangeIntent);
                }
            }
        });*/

        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_SHORT).show();
                    Intent activityChangeIntent = new Intent(MainActivity.this, ListsView.class);
                    MainActivity.this.startActivity(activityChangeIntent);
            }
        });
    }

    /*private boolean fieldsCheck() {
        if (loginUsername.length() == 0) {
            loginUsername.setError("This field is required");
            return false;
        }

        if (loginPassword.length() == 0) {
            loginPassword.setError("Password is required");
            return false;
        } else if (loginPassword.length() < 8) {
            loginPassword.setError("Password must be minimum 8 characters");
            return false;
        }

        if(loginUsername.getText().toString().trim() != "Mehdi" && loginPassword.getText().toString().trim() != "1234567890"){
            loginUsername.setError("Username & password doesn't match !");
            return false;
        }else{
            loginUsername.setError(null);
            return true;
        }
        // after all validation return true.

    }*/
}