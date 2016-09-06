package com.bemental.urldisplay;

public class ValidEulaTaskStub extends EulaTask
{
    @Override
    protected Boolean doInBackground(String... candidateUrl)
    {
        return true;
    }

    @Override
    public void checkUrl(String url)
    {
        onPostExecute(true);
    }
}
