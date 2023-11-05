package com.example.uke43;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

      public static String PROVIDER="com.example.uri" ;
    public static final Uri CONTENT_URI = Uri.parse("content://"+ PROVIDER + "/bok");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContentValues v=new ContentValues();
        v.put("Tittel", "The lost island");
        getContentResolver().insert(CONTENT_URI,v);
    }

}