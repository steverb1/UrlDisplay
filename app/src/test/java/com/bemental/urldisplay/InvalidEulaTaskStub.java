package com.bemental.urldisplay;

public class InvalidEulaTaskStub extends EulaTask
{
    @Override
    protected Boolean doInBackground(String... candidateUrl)
    {
        return false;
    }

    @Override
    protected void onPostExecute(Boolean urlOk)
    {

    }
}
