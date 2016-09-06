package com.bemental.urldisplay;

public class InvalidEulaTaskStub extends EulaTask
{
    @Override
    protected Boolean doInBackground(String... candidateUrl)
    {
        return false;
    }

    @Override
    public void checkUrl(String url)
    {
        onPostExecute(false);
    }
}
