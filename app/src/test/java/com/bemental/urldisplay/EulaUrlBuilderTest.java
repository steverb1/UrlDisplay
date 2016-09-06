package com.bemental.urldisplay;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EulaUrlBuilderTest
{
    MainActivitySpy activitySpy = new MainActivitySpy();

    @Test
    public void returnsGenericUrlIfNoStateCodeExists()
    {
        String stateCode = "";
        ValidEulaTaskStub validEulaTaskStub = new ValidEulaTaskStub();
        EulaUrlBuilder urlBuilder = new EulaUrlBuilder(validEulaTaskStub, activitySpy);
        validEulaTaskStub.AssignBuilder(urlBuilder);
        urlBuilder.urlFromStateCode(stateCode);

        assertThat(activitySpy.displayedUrl, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
    }

    @Test
    public void returnsWashingtonUrlForWashingtonStateCode()
    {
        String stateCode = "WA";
        ValidEulaTaskStub validEulaTaskStub = new ValidEulaTaskStub();
        EulaUrlBuilder urlBuilder = new EulaUrlBuilder(validEulaTaskStub, activitySpy);
        validEulaTaskStub.AssignBuilder(urlBuilder);
        urlBuilder.urlFromStateCode(stateCode);

        assertThat(activitySpy.displayedUrl, is(EulaUrlBuilder.BASE_URL + stateCode + EulaUrlBuilder.TAIL_URL));
    }

    @Test
    public void returnsGenericUrlForPennsylvaniaStateCode()
    {
        String stateCode = "PA";
        InvalidEulaTaskStub invalidEulaTaskStub = new InvalidEulaTaskStub();
        EulaUrlBuilder urlBuilder = new EulaUrlBuilder(invalidEulaTaskStub, activitySpy);
        invalidEulaTaskStub.AssignBuilder(urlBuilder);
        urlBuilder.urlFromStateCode(stateCode);

        assertThat(activitySpy.displayedUrl, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
    }

    @Test
    public void returnsGenericUrlForGenericStateCode()
    {
        String stateCode = "CO";
        InvalidEulaTaskStub invalidEulaTaskStub = new InvalidEulaTaskStub();
        EulaUrlBuilder urlBuilder = new EulaUrlBuilder(invalidEulaTaskStub, activitySpy);
        invalidEulaTaskStub.AssignBuilder(urlBuilder);
        urlBuilder.urlFromStateCode(stateCode);

        assertThat(activitySpy.displayedUrl, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
    }
}
