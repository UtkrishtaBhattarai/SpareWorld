package com.example.spareworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etemail,etpwd;
    Button btnlogin;
    String name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etemail=findViewById(R.id.etemail);
        etpwd=findViewById(R.id.etpwd);
        btnlogin=findViewById(R.id.btnlogin);
        name=etemail.getText().toString();
        password=etpwd.getText().toString();
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etemail.getText().toString().equals("admin") && etpwd.getText().toString().equals("admin"))
                {
                    Intent intent=new Intent(MainActivity.this,LandingActivity.class);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
