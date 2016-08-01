package com.bemental.urldisplay;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class EulaUrlBuilder
{
    public static final String BASE_URL = "http://www.sportsmanregs.com/app/legal/EULA";
    public static final String TAIL_URL = "Android.html";

    public String urlFromStateCode(String stateCode)
    {
        String candidateUrl = BASE_URL + stateCode + TAIL_URL;

        return urlIsValid(candidateUrl) ? candidateUrl : BASE_URL + TAIL_URL;
    }

    private boolean urlIsValid(String candidateUrl)
    {
        try
        {
            HttpURLConnection connection = (HttpURLConnection) new URL(candidateUrl).openConnection();
            return connection.getResponseCode() == HttpURLConnection.HTTP_OK;
        }
        catch (IOException e)
        {
            //e.printStackTrace();
            return false;
        }
    }
}
