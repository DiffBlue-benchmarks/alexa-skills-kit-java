package com.amazon.speech.speechlet.interfaces.core;

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

public class Permission_BuilderTest {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: Permission_Builder */


  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_core_Permission$Builder__init__16db0f94bad1bf0d_000() throws Throwable {

    Object instance;
    {
      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission$Builder");
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
  public void com_amazon_speech_speechlet_interfaces_core_Permission$Builder_access$000_77a0d733c57b517b_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.core.Permission$Builder");
      Reflector.setField(param_0, "scope", null);
      Object x0 = param_0;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission$Builder");
      Method m = c.getDeclaredMethod("access$000", Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission$Builder"));
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
  public void com_amazon_speech_speechlet_interfaces_core_Permission$Builder_withScope_9ee3d10821f2d78d_000() throws Throwable {

    Object retval;
    {
      /* Arrange */
      String param_2 = "";
      Object param_1 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.core.Permission$Builder");
      Reflector.setField(param_1, "scope", param_2);
      String scope = null;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission$Builder");
      Method m = c.getDeclaredMethod("withScope", Reflector.forName("java.lang.String"));
      m.setAccessible(true);
      retval = (Object) m.invoke(param_1, scope);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "scope")));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_core_Permission__init__212478264dfe7f22_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.core.Permission$Builder");
      Reflector.setField(param_0, "scope", null);
      Object builder = param_0;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission$Builder"));
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
  public void com_amazon_speech_speechlet_interfaces_core_Permission__init__3c2743b9e9774b82_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Object param_2 = Reflector.getInstance("com.amazon.speech.speechlet.interfaces.core.Permission$Builder");
      Reflector.setField(param_2, "scope", null);
      Object x0 = param_2;
      Object x1 = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission$Builder"), Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission$1"));
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
  public void com_amazon_speech_speechlet_interfaces_core_Permission__init__49938b6e8c907a92_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      String scope = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.interfaces.core.Permission");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("java.lang.String"));
      ctor.setAccessible(true);
      instance = ctor.newInstance(scope);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_core_Permission_builder_46929aea4c096336_000() throws Throwable {

    Object retval;
    {
      /* Act */
      retval = com.amazon.speech.speechlet.interfaces.core.Permission.builder();
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "scope")));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_core_Permission_getScope_4f9b1b0668031bda_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.interfaces.core.Permission param_0 = (com.amazon.speech.speechlet.interfaces.core.Permission) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.core.Permission");
      Reflector.setField(param_0, "scope", null);

      /* Act */
      retval = param_0.getScope();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }
}
