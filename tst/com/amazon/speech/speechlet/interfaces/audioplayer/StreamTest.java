package com.amazon.speech.speechlet.interfaces.audioplayer;

import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.diffblue.java_testcase.CompareWithFieldList;
import com.diffblue.java_testcase.FieldList;
import com.diffblue.java_testcase.IterAnswer;
import com.diffblue.java_testcase.Reflector;

public class StreamTest {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: Stream */


  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream__init__457f59ca4daf98_000() throws Throwable {

    com.amazon.speech.speechlet.interfaces.audioplayer.Stream instance;
    {
      /* Act */
      /* Creating object to test constructor */
      instance = new com.amazon.speech.speechlet.interfaces.audioplayer.Stream();

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream_getExpectedPreviousToken_ce904e82e190eec3_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_1 = "";
      String param_3 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.Stream param_4 = (com.amazon.speech.speechlet.interfaces.audioplayer.Stream) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.Stream");
      Reflector.setField(param_4, "offsetInMilliseconds", 0L);
      Reflector.setField(param_4, "url", param_1);
      Reflector.setField(param_4, "token", param_3);
      Reflector.setField(param_4, "expectedPreviousToken", null);

      /* Act */
      retval = param_4.getExpectedPreviousToken();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream_getOffsetInMilliseconds_282a5d5a9d432b4_000() throws Throwable {

    long retval;
    {
      /* Arrange */
      String param_1 = "";
      String param_3 = "";
      String param_5 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.Stream param_6 = (com.amazon.speech.speechlet.interfaces.audioplayer.Stream) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.Stream");
      Reflector.setField(param_6, "offsetInMilliseconds", 0L);
      Reflector.setField(param_6, "url", param_1);
      Reflector.setField(param_6, "token", param_3);
      Reflector.setField(param_6, "expectedPreviousToken", param_5);

      /* Act */
      retval = param_6.getOffsetInMilliseconds();
    }
    {
      /* Assert result */
      Assert.assertEquals(0L, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream_getToken_fc87dc49ca87a25c_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_1 = "";
      String param_3 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.Stream param_4 = (com.amazon.speech.speechlet.interfaces.audioplayer.Stream) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.Stream");
      Reflector.setField(param_4, "offsetInMilliseconds", 0L);
      Reflector.setField(param_4, "url", param_1);
      Reflector.setField(param_4, "token", null);
      Reflector.setField(param_4, "expectedPreviousToken", param_3);

      /* Act */
      retval = param_4.getToken();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream_getUrl_1d8c2b0f02b97de0_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_1 = "";
      String param_3 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.Stream param_4 = (com.amazon.speech.speechlet.interfaces.audioplayer.Stream) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.Stream");
      Reflector.setField(param_4, "offsetInMilliseconds", 0L);
      Reflector.setField(param_4, "url", null);
      Reflector.setField(param_4, "token", param_1);
      Reflector.setField(param_4, "expectedPreviousToken", param_3);

      /* Act */
      retval = param_4.getUrl();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream_setExpectedPreviousToken_bfb8d99ff3950a87_000() throws Throwable {

    {
      /* Arrange */
      String param_6 = "";
      String param_4 = "";
      String param_2 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.Stream param_1 = (com.amazon.speech.speechlet.interfaces.audioplayer.Stream) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.Stream");
      Reflector.setField(param_1, "offsetInMilliseconds", 0L);
      Reflector.setField(param_1, "url", param_6);
      Reflector.setField(param_1, "token", param_4);
      Reflector.setField(param_1, "expectedPreviousToken", param_2);
      String expectedPreviousToken = null;

      /* Act */
      param_1.setExpectedPreviousToken(expectedPreviousToken);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream_setOffsetInMilliseconds_dfd5998ecb955fb5_000() throws Throwable {

    {
      /* Arrange */
      String param_6 = "";
      String param_4 = "";
      String param_2 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.Stream param_1 = (com.amazon.speech.speechlet.interfaces.audioplayer.Stream) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.Stream");
      Reflector.setField(param_1, "offsetInMilliseconds", 0L);
      Reflector.setField(param_1, "url", param_6);
      Reflector.setField(param_1, "token", param_4);
      Reflector.setField(param_1, "expectedPreviousToken", param_2);
      long offsetInMilliseconds = 0L;

      /* Act */
      param_1.setOffsetInMilliseconds(offsetInMilliseconds);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream_setToken_ffc8b5e5f6e6e0ad_000() throws Throwable {

    {
      /* Arrange */
      String param_6 = "";
      String param_4 = "";
      String param_2 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.Stream param_1 = (com.amazon.speech.speechlet.interfaces.audioplayer.Stream) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.Stream");
      Reflector.setField(param_1, "offsetInMilliseconds", 0L);
      Reflector.setField(param_1, "url", param_6);
      Reflector.setField(param_1, "token", param_4);
      Reflector.setField(param_1, "expectedPreviousToken", param_2);
      String token = null;

      /* Act */
      param_1.setToken(token);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_Stream_setUrl_85c14b1c24aff6bf_000() throws Throwable {

    {
      /* Arrange */
      String param_6 = "";
      String param_4 = "";
      String param_2 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.Stream param_1 = (com.amazon.speech.speechlet.interfaces.audioplayer.Stream) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.Stream");
      Reflector.setField(param_1, "offsetInMilliseconds", 0L);
      Reflector.setField(param_1, "url", param_6);
      Reflector.setField(param_1, "token", param_4);
      Reflector.setField(param_1, "expectedPreviousToken", param_2);
      String url = null;

      /* Act */
      param_1.setUrl(url);

      /* Method return type is void, or not expected to return */
    }
  }
}
