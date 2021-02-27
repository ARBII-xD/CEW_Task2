package com.arbiiapplication.cew_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String extramsg="com.example.task_2.extramsg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenWeb(View view) {
        EditText webURL;
        webURL=(EditText)findViewById(R.id.webURL);
        String et_w=webURL.getText().toString();
        String web = "https://www.google.com/"+et_w;


        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(web));
        startActivity(intent);

    }

    public void mapClick(View view) {
        EditText location;
        location=(EditText)findViewById(R.id.location);
        String et_m=location.getText().toString();
        String url="geo:0, 0?q="+et_m;

        Intent intent2=new Intent(Intent.ACTION_VIEW, Uri.parse(url) );
        startActivity(intent2);

    }
}
