package com.bemental.urldisplay;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EulaUrlBuilderTest
{
    EulaUrlBuilder urlBuilder = new EulaUrlBuilder();

    @Test
    public void returnsGenericUrlIfNoStateCodeExists()
    {
        String stateCode = "";
        String url = urlBuilder.urlFromStateCode(stateCode);
        assertThat(url, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
    }

    @Test
    public void returnsWashingtonUrlForWashingtonStateCode()
    {
        String stateCode = "WA";
        String url = urlBuilder.urlFromStateCode(stateCode);
        assertThat(url, is(EulaUrlBuilder.BASE_URL + stateCode + EulaUrlBuilder.TAIL_URL));
    }

    @Test
    public void returnsGenericUrlForPennsylvaniaStateCode()
    {
        String stateCode = "PA";
        String url = urlBuilder.urlFromStateCode(stateCode);
        assertThat(url, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
    }

    @Test
    public void returnsGenericUrlForGenericStateCode()
    {
        String stateCode = "CO";
        String url = urlBuilder.urlFromStateCode(stateCode);
        assertThat(url, is(EulaUrlBuilder.BASE_URL + EulaUrlBuilder.TAIL_URL));
    }
}
