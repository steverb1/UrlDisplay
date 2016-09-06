package com.bemental.urldisplay;

import android.os.AsyncTask;

import java.net.HttpURLConnection;
import java.net.URL;

public class EulaTask extends AsyncTask<String, Void, Boolean>
{
    private EulaUrlBuilder builder;

    public void AssignBuilder(EulaUrlBuilder builder)
    {
        this.builder = builder;
    }

    @Override
    protected Boolean doInBackground(String... candidateUrl)
    {
        try
        {
            HttpURLConnection connection = (HttpURLConnection) new URL(candidateUrl[0]).openConnection();

            return connection.getResponseCode() == HttpURLConnection.HTTP_OK;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    @Override
    protected void onPostExecute(Boolean urlOk)
    {
        builder.displayUrl(urlOk);
    }
}
