package com.example.kapil.testapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class user extends AppCompatActivity {
private static Button logoutbtn;
private static Button popup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        logoutbtn=(Button)findViewById(R.id.logout);
        popup=(Button)findViewById(R.id.popup);

        logout();
        pop();
    }
    public void pop()
    {
        popup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(user.this,pop.class));

                    }
                }
        );
    }
    public void logout(){
        logoutbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(user.this,"Logout Successfull",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(user.this,MainActivity.class));

                    }
                }
        );
    }
}

