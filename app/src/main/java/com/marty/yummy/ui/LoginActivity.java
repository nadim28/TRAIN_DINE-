package com.marty.yummy.ui;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.marty.yummy.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends Activity {
    private ImageView imageview;
    private EditText username ,password;
    private Button button ;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login_page); // R.layout.activity_main is the XML layout file

            imageview= (ImageView) findViewById(R.id.logo);
            username=(EditText) findViewById(R.id.usernameEditText);
            password=(EditText) findViewById(R.id.passwordEditText);
            button=(Button) findViewById(R.id.loginButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(username.getText().toString().equals("user") && password.getText().toString().equals("1234")){

                        nextLayout();
                       // Intent intent =(new Intent(LoginActivity.this, TrainInfo.class));
                       // startActivity(intent);
                    }
                    else {
                        Toast.makeText(LoginActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }


       void  nextLayout(){
           Intent intent = new Intent(this, TrainInfo.class);
           startActivity(intent);
       }


}
