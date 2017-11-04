package com.soheil.junk;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            Uri uri = intent.getData();
//            String valueOne = uri.getQueryParameter("keyOne");
//            Toast.makeText(getApplicationContext(),valueOne,Toast.LENGTH_LONG).show();
//            String valueTwo = uri.getQueryParameter("keyTwo");
        }
//        String urlString="http://google.com";
//        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.setPackage("com.android.chrome");
//        try {
//            startActivity(intent);
//        } catch (ActivityNotFoundException ex) {
//            // Chrome browser presumably not installed so allow user to choose instead
//            intent.setPackage(null);
//            startActivity(intent);
//        }
    }
}
