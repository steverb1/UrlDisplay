package com.bemental.urldisplay;

import android.os.AsyncTask;

public class EulaUrlBuilder
{
    public static final String BASE_URL = "http://www.sportsmanregs.com/app/legal/EULA";
    public static final String TAIL_URL = "Android.html";

    private MainActivity mainActivity;
    private String candidateUrl;
    private AsyncTask<String, Void, Boolean> eulaTask;

    public EulaUrlBuilder(AsyncTask<String, Void, Boolean> eulaTask, MainActivity mainActivity)
    {
        this.eulaTask = eulaTask;
        this.mainActivity = mainActivity;
    }

    public void urlFromStateCode(String stateCode)
    {
        candidateUrl = BASE_URL + stateCode + TAIL_URL;

        eulaTask.execute(candidateUrl);
    }

    void displayUrl(Boolean urlOk)
    {
        String validUrl = urlOk ? candidateUrl : BASE_URL + TAIL_URL;
        mainActivity.displayUrl(validUrl);
    }
}
