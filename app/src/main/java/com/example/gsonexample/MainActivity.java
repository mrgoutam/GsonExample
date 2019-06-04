package com.example.gsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        /*
        Employee employee = new Employee("Goutam","26","mrgoutam8.3@gmail.com");
        String json = gson.toJson(employee);
        Log.d(TAG, "onCreate: "+json);
*/
        String json = "{\"mAge\":\"26\",\"mEmail\":\"mrgoutam8.3@gmail.com\",\"mFirstName\":\"Goutam\"}";
        Employee employee = gson.fromJson(json, Employee.class);
        int i = 10;
    }
}
