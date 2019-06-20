package com.joshian.android.loginservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    public static  final String URL= "http://192.168.0.104:8080/first/login/";
    private static final String TAG = MainActivity.class.getName();
    Button submitButton;

    EditText userNameText;
    EditText userPassText;

    RequestQueue mRequestQueue;
    StringRequest mStringRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameText = findViewById(R.id.userText);
        userPassText = findViewById(R.id.userPassword);
/*
        TextView textView = findViewById(R.id.newUser);
        System.out.print(textView.getText());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Register.class));
            }
        });
*/
        submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               validateCredentials(userNameText.getText().toString(), userPassText.getText().toString());
            }
        });
    }

    public void validateCredentials(String uName, String uPassword)
    {
       /* mRequestQueue = Volley.newRequestQueue(this);
        mStringRequest = new StringRequest(Request.Method.GET, URL+uName+"/"+uPassword, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG, "onResponse: "+response);
                if(response.isEmpty())
                {
                    startActivity(new Intent(MainActivity.this,Register.class));
                }
                else {
                    Toast.makeText(getApplicationContext(), "Response Success  " + response, Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, Welcome.class));

                   // parseData(response);

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(TAG,"Error :" + error.toString());

            }
        });
        mRequestQueue.add(mStringRequest);
*/

        if(uName.equals("Anuj") && uPassword.equals("Joshi")) {
            startActivity(new Intent(MainActivity.this, Welcome.class));
        }
    }



    public void register(View v)
     {
         startActivity(new Intent(MainActivity.this,Register.class));
     }
}
