package com.bemental.urldisplay;

import android.content.Intent;
import android.net.Uri;
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

    public void prepareUrl(View view)
    {
        EditText editText = (EditText) findViewById(R.id.state_code_text);
        String state_code = editText.getText().toString();
        EulaTask eulaTask = new EulaTask();
        EulaUrlBuilder builder = new EulaUrlBuilder(eulaTask, this);
        eulaTask.AssignBuilder(builder);

        builder.urlFromStateCode(state_code);
    }

    public void displayUrl(String validUrl)
    {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(validUrl));
        startActivity(intent);
    }
}
