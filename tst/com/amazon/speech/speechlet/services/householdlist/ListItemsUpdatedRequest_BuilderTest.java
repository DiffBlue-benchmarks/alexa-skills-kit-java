package com.amazon.speech.speechlet.services.householdlist;

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

public class ListItemsUpdatedRequest_BuilderTest {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: ListItemsUpdatedRequest_Builder */


  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest$Builder_access$100_65586d79298c13b3_000() throws Throwable {

    com.amazon.speech.speechlet.services.householdlist.ListItemBody retval;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Reflector.setField(param_0, "body", null);
      Reflector.setField(param_0, "requestId", null);
      Reflector.setField(param_0, "timestamp", null);
      Reflector.setField(param_0, "locale", null);
      Object x0 = param_0;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Method m = c.getDeclaredMethod("access$100", Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder"));
      m.setAccessible(true);
      retval = (com.amazon.speech.speechlet.services.householdlist.ListItemBody) m.invoke(null, x0);
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
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest$Builder_build_8d7925d6eec26730_000() throws Throwable {

    com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest retval;
    {
      /* Arrange */
      String param_1 = "";
      Object param_2 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Reflector.setField(param_2, "body", null);
      Reflector.setField(param_2, "requestId", param_1);
      Reflector.setField(param_2, "timestamp", null);
      Reflector.setField(param_2, "locale", null);

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Method m = c.getDeclaredMethod("build");
      m.setAccessible(true);
      retval = (com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest) m.invoke(param_2);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "locale"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "timestamp"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "body"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest$Builder_build_b0488ef9717da2b2_000() throws Throwable {

    com.amazon.speech.speechlet.SpeechletRequest retval;
    {
      /* Arrange */
      String param_1 = "";
      Object param_2 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Reflector.setField(param_2, "body", null);
      Reflector.setField(param_2, "requestId", param_1);
      Reflector.setField(param_2, "timestamp", null);
      Reflector.setField(param_2, "locale", null);

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Method m = c.getDeclaredMethod("build");
      m.setAccessible(true);
      retval = (com.amazon.speech.speechlet.SpeechletRequest) m.invoke(param_2);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "locale"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "timestamp"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "body"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest$Builder_withListItemBody_404a14e738bb1632_000() throws Throwable {

    Object retval;
    {
      /* Arrange */
      String param_2 = "";
      Object param_1 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Reflector.setField(param_1, "body", null);
      Reflector.setField(param_1, "requestId", param_2);
      Reflector.setField(param_1, "timestamp", null);
      Reflector.setField(param_1, "locale", null);
      com.amazon.speech.speechlet.services.householdlist.ListItemBody body = null;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Method m = c.getDeclaredMethod("withListItemBody", Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody"));
      m.setAccessible(true);
      retval = (Object) m.invoke(param_1, body);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "requestId")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "timestamp"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "locale"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "body"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest__init__3c0ca9e625c71c5e_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Object param_2 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Reflector.setField(param_2, "body", null);
      Reflector.setField(param_2, "requestId", null);
      Reflector.setField(param_2, "timestamp", null);
      Reflector.setField(param_2, "locale", null);
      Object x0 = param_2;
      Object x1 = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder"), Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$1"));
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
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest__init__e50105b849156e5f_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder");
      Reflector.setField(param_0, "body", null);
      Reflector.setField(param_0, "requestId", null);
      Reflector.setField(param_0, "timestamp", null);
      Reflector.setField(param_0, "locale", null);
      Object builder = param_0;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest$Builder"));
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
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest__init__fa975214347923d1_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      String requestId = null;
      java.util.Date timestamp = null;
      java.util.Locale locale = null;
      com.amazon.speech.speechlet.services.householdlist.ListItemBody body = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("java.lang.String"), Reflector.forName("java.util.Date"), Reflector.forName("java.util.Locale"), Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody"));
      ctor.setAccessible(true);
      instance = ctor.newInstance(requestId, timestamp, locale, body);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest_getListId_5c7c6ae73c265316_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.services.householdlist.ListItemBody param_0 = (com.amazon.speech.speechlet.services.householdlist.ListItemBody) Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemBody");
      Reflector.setField(param_0, "listItemIds", null);
      Reflector.setField(param_0, "listId", null);
      String param_2 = "";
      com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest param_3 = (com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest) Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest");
      Reflector.setField(param_3, "body", param_0);
      Reflector.setField(param_3, "timestamp", null);
      Reflector.setField(param_3, "locale", null);
      Reflector.setField(param_3, "requestId", param_2);

      /* Act */
      retval = param_3.getListId();
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
  public void com_amazon_speech_speechlet_services_householdlist_ListItemsUpdatedRequest_getListItemIds_375b1a512a7951ee_000() throws Throwable {

    java.util.List<String> retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.services.householdlist.ListItemBody param_0 = (com.amazon.speech.speechlet.services.householdlist.ListItemBody) Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemBody");
      Reflector.setField(param_0, "listItemIds", null);
      Reflector.setField(param_0, "listId", null);
      java.util.Date param_1 = (java.util.Date) Reflector.getInstance("java.util.Date");
      Reflector.setField(param_1, "cdate", null);
      Reflector.setField(param_1, "fastTime", 0L);
      String param_3 = "";
      com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest param_4 = (com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest) Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemsUpdatedRequest");
      Reflector.setField(param_4, "body", param_0);
      Reflector.setField(param_4, "timestamp", param_1);
      Reflector.setField(param_4, "locale", null);
      Reflector.setField(param_4, "requestId", param_3);

      /* Act */
      retval = param_4.getListItemIds();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }
}
