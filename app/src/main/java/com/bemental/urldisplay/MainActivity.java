package com.bemental.urldisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
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
        new EulaUrlBuilder().urlFromStateCode(state_code, this);
    }
}
