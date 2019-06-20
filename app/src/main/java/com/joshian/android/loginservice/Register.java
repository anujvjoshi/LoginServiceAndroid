package com.joshian.android.loginservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText userNameText;
    EditText userPassText;
    Button submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userNameText = (EditText)findViewById(R.id.userText);
        userPassText = (EditText)findViewById(R.id.userPassword);
        submitBtn = (Button)findViewById(R.id.submit);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameText.getText().toString();
                String userPassword = userPassText.getText().toString();

                if(userName.isEmpty() || userPassword.isEmpty())
                {
                    Toast.makeText(Register.this,"Please enter all details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Register.this,"Registeration complete", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
