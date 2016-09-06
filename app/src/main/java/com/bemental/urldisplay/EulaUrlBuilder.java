package com.bemental.urldisplay;

public class EulaUrlBuilder
{
    public static final String BASE_URL = "http://www.sportsmanregs.com/app/legal/EULA";
    public static final String TAIL_URL = "Android.html";

    private MainActivity mainActivity;
    private String candidateUrl;
    private EulaTask eulaTask;

    public EulaUrlBuilder(EulaTask eulaTask, MainActivity mainActivity)
    {
        this.eulaTask = eulaTask;
        this.mainActivity = mainActivity;
    }

    public void urlFromStateCode(String stateCode)
    {
        candidateUrl = BASE_URL + stateCode + TAIL_URL;

        eulaTask.checkUrl(candidateUrl);
    }

    void displayUrl(Boolean urlOk)
    {
        String validUrl = urlOk ? candidateUrl : BASE_URL + TAIL_URL;
        mainActivity.displayUrl(validUrl);
    }
}
