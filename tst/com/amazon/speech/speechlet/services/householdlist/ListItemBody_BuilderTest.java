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

public class ListItemBody_BuilderTest {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: ListItemBody_Builder */


  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemBody$Builder__init__84f009a83c599184_000() throws Throwable {

    Object instance;
    {
      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Constructor<?> ctor = c.getDeclaredConstructor();
      ctor.setAccessible(true);
      instance = ctor.newInstance();

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemBody$Builder_access$000_ffa1ac241b8cdba0_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Reflector.setField(param_0, "listItemIds", null);
      Reflector.setField(param_0, "listId", null);
      Object x0 = param_0;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Method m = c.getDeclaredMethod("access$000", Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder"));
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
  public void com_amazon_speech_speechlet_services_householdlist_ListItemBody$Builder_access$100_85022ce9ba800dca_000() throws Throwable {

    java.util.List retval;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Reflector.setField(param_0, "listItemIds", null);
      Reflector.setField(param_0, "listId", null);
      Object x0 = param_0;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Method m = c.getDeclaredMethod("access$100", Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder"));
      m.setAccessible(true);
      retval = (java.util.List) m.invoke(null, x0);
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
  public void com_amazon_speech_speechlet_services_householdlist_ListItemBody$Builder_withListId_416044a2ababebd2_000() throws Throwable {

    Object retval;
    {
      /* Arrange */
      String param_2 = "";
      Object param_1 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Reflector.setField(param_1, "listItemIds", null);
      Reflector.setField(param_1, "listId", param_2);
      String listId = null;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Method m = c.getDeclaredMethod("withListId", Reflector.forName("java.lang.String"));
      m.setAccessible(true);
      retval = (Object) m.invoke(param_1, listId);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "listId")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "listItemIds"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemBody$Builder_withListItemIds_a99bec303dc69d17_000() throws Throwable {

    Object retval;
    {
      /* Arrange */
      String param_2 = "";
      Object param_1 = Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Reflector.setField(param_1, "listItemIds", null);
      Reflector.setField(param_1, "listId", param_2);
      java.util.List<String> listItemIds = null;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.services.householdlist.ListItemBody$Builder");
      Method m = c.getDeclaredMethod("withListItemIds", Reflector.forName("java.util.List"));
      m.setAccessible(true);
      retval = (Object) m.invoke(param_1, listItemIds);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "listId")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "listId")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "listItemIds"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemBody_builder_9c5af87bf0d2698c_000() throws Throwable {

    Object retval;
    {
      /* Act */
      retval = com.amazon.speech.speechlet.services.householdlist.ListItemBody.builder();
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "listId")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "listItemIds"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_services_householdlist_ListItemBody_getListId_e155ce3da61469f_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.services.householdlist.ListItemBody param_0 = (com.amazon.speech.speechlet.services.householdlist.ListItemBody) Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemBody");
      Reflector.setField(param_0, "listItemIds", null);
      Reflector.setField(param_0, "listId", null);

      /* Act */
      retval = param_0.getListId();
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
  public void com_amazon_speech_speechlet_services_householdlist_ListItemBody_getListItemIds_aa0abd97392724dd_000() throws Throwable {

    java.util.List<String> retval;
    {
      /* Arrange */
      String param_1 = "";
      com.amazon.speech.speechlet.services.householdlist.ListItemBody param_2 = (com.amazon.speech.speechlet.services.householdlist.ListItemBody) Reflector.getInstance("com.amazon.speech.speechlet.services.householdlist.ListItemBody");
      Reflector.setField(param_2, "listItemIds", null);
      Reflector.setField(param_2, "listId", param_1);

      /* Act */
      retval = param_2.getListItemIds();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }
}
