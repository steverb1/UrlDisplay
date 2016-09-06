package com.bemental.urldisplay;

public class MainActivitySpy extends MainActivity
{
    public String displayedUrl;

    @Override
    public void displayUrl(String validUrl)
    {
        displayedUrl = validUrl;
    }
}
