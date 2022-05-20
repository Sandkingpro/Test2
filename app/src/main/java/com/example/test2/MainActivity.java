package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME ="my_shared_preff";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        int i=sharedPreferences.getInt("count",0);
        i+=1;
        editor.putInt("count",i);
        editor.apply();
        if(i==3){
            Toast.makeText(getBaseContext(),"Это 3 холодный старт",Toast.LENGTH_SHORT).show();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}