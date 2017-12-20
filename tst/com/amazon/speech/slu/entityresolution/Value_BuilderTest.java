package com.amazon.speech.slu.entityresolution;

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

public class Value_BuilderTest {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: Value_Builder */


  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_slu_entityresolution_Value$Builder__init__a752b4ad4ea4a9bd_000() throws Throwable {

    Object instance;
    {
      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder");
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
  public void com_amazon_speech_slu_entityresolution_Value$Builder_access$000_1ef172d8f7641557_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.slu.entityresolution.Value$Builder");
      Reflector.setField(param_0, "id", null);
      Reflector.setField(param_0, "name", null);
      Object x0 = param_0;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder");
      Method m = c.getDeclaredMethod("access$000", Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder"));
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
  public void com_amazon_speech_slu_entityresolution_Value$Builder_access$100_b37773eefe927175_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.slu.entityresolution.Value$Builder");
      Reflector.setField(param_0, "id", null);
      Reflector.setField(param_0, "name", null);
      Object x0 = param_0;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder");
      Method m = c.getDeclaredMethod("access$100", Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder"));
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
  public void com_amazon_speech_slu_entityresolution_Value$Builder_withId_4fdea8bf6fbc553c_000() throws Throwable {

    Object retval;
    {
      /* Arrange */
      String param_4 = "";
      String param_2 = "";
      Object param_1 = Reflector.getInstance("com.amazon.speech.slu.entityresolution.Value$Builder");
      Reflector.setField(param_1, "id", param_4);
      Reflector.setField(param_1, "name", param_2);
      String id = null;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder");
      Method m = c.getDeclaredMethod("withId", Reflector.forName("java.lang.String"));
      m.setAccessible(true);
      retval = (Object) m.invoke(param_1, id);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "name")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "name")));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "id")));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_slu_entityresolution_Value$Builder_withName_4c63a960f31fae07_000() throws Throwable {

    Object retval;
    {
      /* Arrange */
      String param_4 = "";
      String param_2 = "";
      Object param_1 = Reflector.getInstance("com.amazon.speech.slu.entityresolution.Value$Builder");
      Reflector.setField(param_1, "id", param_4);
      Reflector.setField(param_1, "name", param_2);
      String name = null;

      /* Act */
      Class<?> c = Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder");
      Method m = c.getDeclaredMethod("withName", Reflector.forName("java.lang.String"));
      m.setAccessible(true);
      retval = (Object) m.invoke(param_1, name);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "name")));
      Assert.assertNotNull(((String) Reflector.getInstanceField(retval, "id")));
      Assert.assertEquals("", ((String) Reflector.getInstanceField(retval, "id")));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_slu_entityresolution_Value__init__7a54e3608825dfee_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      String name = null;
      String id = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.slu.entityresolution.Value");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("java.lang.String"), Reflector.forName("java.lang.String"));
      ctor.setAccessible(true);
      instance = ctor.newInstance(name, id);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_slu_entityresolution_Value__init__8f1eb8d99ab54d3d_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Object param_0 = Reflector.getInstance("com.amazon.speech.slu.entityresolution.Value$Builder");
      Reflector.setField(param_0, "id", null);
      Reflector.setField(param_0, "name", null);
      Object builder = param_0;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.slu.entityresolution.Value");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder"));
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
  public void com_amazon_speech_slu_entityresolution_Value__init__ff498cc4cc2c10f5_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Object param_2 = Reflector.getInstance("com.amazon.speech.slu.entityresolution.Value$Builder");
      Reflector.setField(param_2, "id", null);
      Reflector.setField(param_2, "name", null);
      Object x0 = param_2;
      Object x1 = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.slu.entityresolution.Value");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.amazon.speech.slu.entityresolution.Value$Builder"), Reflector.forName("com.amazon.speech.slu.entityresolution.Value$1"));
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
  public void com_amazon_speech_slu_entityresolution_Value_builder_863856655e2808f9_000() throws Throwable {

    Object retval;
    {
      /* Act */
      retval = com.amazon.speech.slu.entityresolution.Value.builder();
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "name")));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(retval, "id")));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_slu_entityresolution_Value_getId_b5a0ba0be3edb74d_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_1 = "";
      com.amazon.speech.slu.entityresolution.Value param_2 = (com.amazon.speech.slu.entityresolution.Value) Reflector.getInstance("com.amazon.speech.slu.entityresolution.Value");
      Reflector.setField(param_2, "id", null);
      Reflector.setField(param_2, "name", param_1);

      /* Act */
      retval = param_2.getId();
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
  public void com_amazon_speech_slu_entityresolution_Value_getName_50ce8a1d07b58c1e_000() throws Throwable {

    String retval;
    {
      /* Arrange */
      String param_1 = "";
      com.amazon.speech.slu.entityresolution.Value param_2 = (com.amazon.speech.slu.entityresolution.Value) Reflector.getInstance("com.amazon.speech.slu.entityresolution.Value");
      Reflector.setField(param_2, "id", param_1);
      Reflector.setField(param_2, "name", null);

      /* Act */
      retval = param_2.getName();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }
}
