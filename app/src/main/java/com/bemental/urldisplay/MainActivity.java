package com.bemental.urldisplay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public static final String BASE_URL = "http://www.sportsmanregs.com/app/legal/EULA";
    public static final String TAIL_URL = "Android.html";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayUrl(View view)
    {
        EditText editText = (EditText) findViewById(R.id.state_code_text);
        String state_code = editText.getText().toString();
        String validUrl = BASE_URL + state_code + TAIL_URL;
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(validUrl));
        startActivity(intent);
    }
}
