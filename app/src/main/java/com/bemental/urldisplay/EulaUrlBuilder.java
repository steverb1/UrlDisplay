package com.bemental.urldisplay;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

import java.net.HttpURLConnection;
import java.net.URL;

public class EulaUrlBuilder extends AsyncTask<String, Void, Boolean>
{
    public static final String BASE_URL = "http://www.sportsmanregs.com/app/legal/EULA";
    public static final String TAIL_URL = "Android.html";

    private MainActivity mainActivity;
    private String candidateUrl;

    public void urlFromStateCode(String stateCode, MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
        candidateUrl = BASE_URL + stateCode + TAIL_URL;

        this.execute(candidateUrl);
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
        String validUrl = urlOk ? candidateUrl : BASE_URL + TAIL_URL;
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(validUrl));
        mainActivity.startActivity(intent);
    }
}
