package com.amazon.speech.speechlet.interfaces.audioplayer.request;

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

public class PlaybackNearlyFinishedRequest_BuilderTest {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: PlaybackNearlyFinishedRequest_Builder */


  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest$Builder_access$100_9788a215a6c1704f_000() throws Throwable {

    long retval;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Reflector.setField(param_0, "token", null);
      Reflector.setField(param_0, "timestamp", null);
      Reflector.setField(param_0, "requestId", null);
      Reflector.setField(param_0, "locale", null);
      Reflector.setField(param_0, "offsetInMilliseconds", 0L);
      Object x0 = param_0;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Method m = c.getDeclaredMethod("access$100", Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder"));
      m.setAccessible(true);
      retval = (long) m.invoke(null, x0);
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
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest$Builder_access$200_3959f615983e9d25_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Reflector.setField(param_0, "token", null);
      Reflector.setField(param_0, "timestamp", null);
      Reflector.setField(param_0, "requestId", null);
      Reflector.setField(param_0, "locale", null);
      Reflector.setField(param_0, "offsetInMilliseconds", 0L);
      Object x0 = param_0;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Method m = c.getDeclaredMethod("access$200", Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder"));
      m.setAccessible(true);
      retval = (String) m.invoke(null, x0);
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
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest$Builder_withOffsetInMilliseconds_2224b2ba88b83301_000() throws Throwable {

    Object retval;
    {
      /* Arrange */
      String param_4 = "";
      String param_2 = "";
      Object param_1 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Reflector.setField(param_1, "token", param_4);
      Reflector.setField(param_1, "timestamp", null);
      Reflector.setField(param_1, "requestId", param_2);
      Reflector.setField(param_1, "locale", null);
      Reflector.setField(param_1, "offsetInMilliseconds", 0L);
      long offsetInMilliseconds = 0L;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Method m = c.getDeclaredMethod("withOffsetInMilliseconds", Reflector.forName("long"));
      m.setAccessible(true);
      retval = (Object) m.invoke(param_1, offsetInMilliseconds);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "timestamp"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "locale"));
      Assert.assertEquals(0L, Reflector.getInstanceField(retval, "offsetInMilliseconds"));
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "token")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "token")));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest$Builder_withToken_a08579f18457f75e_000() throws Throwable {

    Object retval;
    {
      /* Arrange */
      String param_4 = "";
      String param_2 = "";
      Object param_1 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Reflector.setField(param_1, "token", param_4);
      Reflector.setField(param_1, "timestamp", null);
      Reflector.setField(param_1, "requestId", param_2);
      Reflector.setField(param_1, "locale", null);
      Reflector.setField(param_1, "offsetInMilliseconds", 0L);
      String token = null;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Method m = c.getDeclaredMethod("withToken", Reflector.forName("java.lang.String"));
      m.setAccessible(true);
      retval = (Object) m.invoke(param_1, token);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "timestamp"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "locale"));
      Assert.assertEquals(0L, Reflector.getInstanceField(retval, "offsetInMilliseconds"));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "token")));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest__init__2a6950df4efddb31_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Reflector.setField(param_0, "token", null);
      Reflector.setField(param_0, "timestamp", null);
      Reflector.setField(param_0, "requestId", null);
      Reflector.setField(param_0, "locale", null);
      Reflector.setField(param_0, "offsetInMilliseconds", 0L);
      Object builder = param_0;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder"));
      ctor.setAccessible(true);
      instance = ctor.newInstance(builder);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest__init__36f6fbce5a21c158_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Object param_2 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder");
      Reflector.setField(param_2, "token", null);
      Reflector.setField(param_2, "timestamp", null);
      Reflector.setField(param_2, "requestId", null);
      Reflector.setField(param_2, "locale", null);
      Reflector.setField(param_2, "offsetInMilliseconds", 0L);
      Object x0 = param_2;
      Object x1 = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$Builder"), Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest$1"));
      ctor.setAccessible(true);
      instance = ctor.newInstance(x0, x1);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest__init__93138b828fc167e7_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      String requestId = null;
      java.util.Date timestamp = null;
      java.util.Locale locale = null;
      long offsetInMilliseconds = 0L;
      String token = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("java.lang.String"), Reflector.forName("java.util.Date"), Reflector.forName("java.util.Locale"), Reflector.forName("long"), Reflector.forName("java.lang.String"));
      ctor.setAccessible(true);
      instance = ctor.newInstance(requestId, timestamp, locale, offsetInMilliseconds, token);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest_getOffsetInMilliseconds_ec8fac35f73cb089_000() throws Throwable {

    long retval;
    {
      /* Arrange */
      String param_1 = "";
      String param_3 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest param_4 = (com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest");
      Reflector.setField(param_4, "token", param_1);
      Reflector.setField(param_4, "requestId", param_3);
      Reflector.setField(param_4, "timestamp", null);
      Reflector.setField(param_4, "locale", null);
      Reflector.setField(param_4, "offsetInMilliseconds", 0L);

      /* Act */
      retval = param_4.getOffsetInMilliseconds();
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
  public void com_amazon_speech_speechlet_interfaces_audioplayer_request_PlaybackNearlyFinishedRequest_getToken_8c6474549b20f4d3_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_1 = "";
      com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest param_2 = (com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.request.PlaybackNearlyFinishedRequest");
      Reflector.setField(param_2, "token", null);
      Reflector.setField(param_2, "requestId", param_1);
      Reflector.setField(param_2, "timestamp", null);
      Reflector.setField(param_2, "locale", null);
      Reflector.setField(param_2, "offsetInMilliseconds", 0L);

      /* Act */
      retval = param_2.getToken();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }
}
