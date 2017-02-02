package com.example.kapil.testapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass);
        loginbtn=(Button)findViewById(R.id.loginbtn);
        login();


    }

    public void login(){
        loginbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().trim().equals("115A1080") &&
                                (password.getText().toString().trim().equals("1"))){
                            Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(MainActivity.this,user.class));

                        }
                        else
                        {
                            Toast.makeText(MainActivity.this,"Error while Sign In",Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
    }



}
