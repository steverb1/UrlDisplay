package com.bemental.urldisplay;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EulaUrlBuilderTest
{
    //EulaUrlBuilder urlBuilder = new EulaUrlBuilder();

    @Test
    public void returnsGenericUrlIfNoStateCodeExists()
    {
        String stateCode = "";
        ValidEulaTaskStub validEulaTaskStub = new ValidEulaTaskStub();
        MainActivitySpy activitySpy = new MainActivitySpy();
        EulaUrlBuilder urlBuilder = new EulaUrlBuilder(validEulaTaskStub, activitySpy);
        urlBuilder.urlFromStateCode(stateCode);

        assertThat(activitySpy.displayedUrl, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
    }

//    @Test
//    public void returnsWashingtonUrlForWashingtonStateCode()
//    {
//        String stateCode = "WA";
//        urlBuilder.urlFromStateCode(stateCode, null);
//        assertThat(url, is(EulaUrlBuilder.BASE_URL + stateCode + EulaUrlBuilder.TAIL_URL));
//    }
//
//    @Test
//    public void returnsGenericUrlForPennsylvaniaStateCode()
//    {
//        String stateCode = "PA";
//        urlBuilder.urlFromStateCode(stateCode, null);
//        assertThat(url, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
//    }
//
//    @Test
//    public void returnsGenericUrlForGenericStateCode()
//    {
//        String stateCode = "CO";
//        urlBuilder.urlFromStateCode(stateCode, null);
//        assertThat(url, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
//    }
}
