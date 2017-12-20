package com.amazon.speech.speechlet;

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

public class SpeechletResponseTest {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: SpeechletResponse */


  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse__init__b999a66297669094_000() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse instance;
    {
      /* Act */
      /* Creating object to test constructor */
      instance = new com.amazon.speech.speechlet.SpeechletResponse();

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse__init__ef6b9fa00690e32d_000() throws Throwable {

    Object instance;
    {
      /* Arrange */
      Boolean shouldEndSession = null;

      /* Act */
      /* Creating object to test constructor */
      Class<?> c = Reflector.forName("com.amazon.speech.speechlet.SpeechletResponse");
      Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("java.lang.Boolean"));
      ctor.setAccessible(true);
      instance = ctor.newInstance(shouldEndSession);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_getCard_81a9b1d74e5e2354_000() throws Throwable {

    com.amazon.speech.ui.Card retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_0 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_0, "shouldEndSession", null);
      Reflector.setField(param_0, "outputSpeech", null);
      Reflector.setField(param_0, "card", null);
      Reflector.setField(param_0, "directives", null);
      Reflector.setField(param_0, "reprompt", null);

      /* Act */
      retval = param_0.getCard();
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
  public void com_amazon_speech_speechlet_SpeechletResponse_getDirectives_ec66b38b6dae749f_000() throws Throwable {

    java.util.List<com.amazon.speech.speechlet.Directive> retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_0 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_0, "shouldEndSession", null);
      Reflector.setField(param_0, "outputSpeech", null);
      Reflector.setField(param_0, "card", null);
      Reflector.setField(param_0, "directives", null);
      Reflector.setField(param_0, "reprompt", null);

      /* Act */
      retval = param_0.getDirectives();
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
  public void com_amazon_speech_speechlet_SpeechletResponse_getNullableShouldEndSession_61aff360b59fa114_000() throws Throwable {

    Boolean retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_0 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_0, "shouldEndSession", null);
      Reflector.setField(param_0, "outputSpeech", null);
      Reflector.setField(param_0, "card", null);
      Reflector.setField(param_0, "directives", null);
      Reflector.setField(param_0, "reprompt", null);

      /* Act */
      retval = param_0.getNullableShouldEndSession();
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
  public void com_amazon_speech_speechlet_SpeechletResponse_getOutputSpeech_517000e74bc014f8_000() throws Throwable {

    com.amazon.speech.ui.OutputSpeech retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_0 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_0, "shouldEndSession", null);
      Reflector.setField(param_0, "outputSpeech", null);
      Reflector.setField(param_0, "card", null);
      Reflector.setField(param_0, "directives", null);
      Reflector.setField(param_0, "reprompt", null);

      /* Act */
      retval = param_0.getOutputSpeech();
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
  public void com_amazon_speech_speechlet_SpeechletResponse_getReprompt_4fa32b92938e6beb_000() throws Throwable {

    com.amazon.speech.ui.Reprompt retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_0 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_0, "shouldEndSession", null);
      Reflector.setField(param_0, "outputSpeech", null);
      Reflector.setField(param_0, "card", null);
      Reflector.setField(param_0, "directives", null);
      Reflector.setField(param_0, "reprompt", null);

      /* Act */
      retval = param_0.getReprompt();
    }
    {
      /* Assert result */
      Assert.assertEquals(null, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 85 branch to line 86
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_getShouldEndSession_d182066556ea65bd_000() throws Throwable {

    boolean retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_0 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_0, "shouldEndSession", null);
      Reflector.setField(param_0, "outputSpeech", null);
      Reflector.setField(param_0, "card", null);
      Reflector.setField(param_0, "directives", null);
      Reflector.setField(param_0, "reprompt", null);

      /* Act */
      retval = param_0.getShouldEndSession();
    }
    {
      /* Assert result */
      Assert.assertEquals(false, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 85 branch to line 88
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_getShouldEndSession_d182066556ea65bd_001() throws Throwable {

    boolean retval;
    {
      /* Arrange */
      Boolean param_0 = new Boolean(false);
      com.amazon.speech.speechlet.SpeechletResponse param_1 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_1, "shouldEndSession", param_0);
      Reflector.setField(param_1, "outputSpeech", null);
      Reflector.setField(param_1, "card", null);
      Reflector.setField(param_1, "directives", null);
      Reflector.setField(param_1, "reprompt", null);

      /* Act */
      retval = param_1.getShouldEndSession();
    }
    {
      /* Assert result */
      Assert.assertEquals(false, retval);
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 290 branch to line 294
   * conditional line 294 branch to line 294
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newAskResponse_47f75307988c95e5_000() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      com.amazon.speech.ui.PlainTextOutputSpeech param_2 = (com.amazon.speech.ui.PlainTextOutputSpeech) Reflector.getInstance("com.amazon.speech.ui.PlainTextOutputSpeech");
      Reflector.setField(param_2, "text", null);
      Reflector.setField(param_2, "id", null);
      com.amazon.speech.ui.OutputSpeech outputSpeech = param_2;
      com.amazon.speech.ui.Reprompt param_5 = (com.amazon.speech.ui.Reprompt) Reflector.getInstance("com.amazon.speech.ui.Reprompt");
      Reflector.setField(param_5, "outputSpeech", null);
      com.amazon.speech.ui.Reprompt reprompt = param_5;
      com.amazon.speech.ui.AskForPermissionsConsentCard param_0 = (com.amazon.speech.ui.AskForPermissionsConsentCard) Reflector.getInstance("com.amazon.speech.ui.AskForPermissionsConsentCard");
      Reflector.setField(param_0, "permissions", null);
      Reflector.setField(param_0, "title", null);
      com.amazon.speech.ui.Card card = param_0;

      /* Act */
      retval = com.amazon.speech.speechlet.SpeechletResponse.newAskResponse(outputSpeech, reprompt, card);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(Reflector.getInstanceField(retval, "outputSpeech"));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "outputSpeech"), "id")));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "outputSpeech"), "text")));
      Assert.assertNotNull(Reflector.getInstanceField(retval, "card"));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "card"), "title")));
      Assert.assertEquals(null, Reflector.getInstanceField(Reflector.getInstanceField(retval, "card"), "permissions"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "directives"));
      Assert.assertNotNull(Reflector.getInstanceField(retval, "reprompt"));
      Assert.assertEquals(null, Reflector.getInstanceField(Reflector.getInstanceField(retval, "reprompt"), "outputSpeech"));
      Assert.assertNotNull(Reflector.getInstanceField(retval, "shouldEndSession"));
      Assert.assertEquals(new Boolean(false), Reflector.getInstanceField(retval, "shouldEndSession"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 290 branch to line 291
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newAskResponse_47f75307988c95e5_001() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      com.amazon.speech.ui.PlainTextOutputSpeech param_1 = (com.amazon.speech.ui.PlainTextOutputSpeech) Reflector.getInstance("com.amazon.speech.ui.PlainTextOutputSpeech");
      Reflector.setField(param_1, "text", null);
      Reflector.setField(param_1, "id", null);
      com.amazon.speech.ui.OutputSpeech outputSpeech = param_1;
      com.amazon.speech.ui.Reprompt param_4 = (com.amazon.speech.ui.Reprompt) Reflector.getInstance("com.amazon.speech.ui.Reprompt");
      Reflector.setField(param_4, "outputSpeech", null);
      com.amazon.speech.ui.Reprompt reprompt = param_4;
      com.amazon.speech.ui.Card card = null;

      /* Act */
      thrown.expect(IllegalArgumentException.class);
      retval = com.amazon.speech.speechlet.SpeechletResponse.newAskResponse(outputSpeech, reprompt, card);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 256 branch to line 260
   * conditional line 260 branch to line 264
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newAskResponse_a8b055558568345f_000() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      com.amazon.speech.ui.PlainTextOutputSpeech param_3 = (com.amazon.speech.ui.PlainTextOutputSpeech) Reflector.getInstance("com.amazon.speech.ui.PlainTextOutputSpeech");
      Reflector.setField(param_3, "text", null);
      Reflector.setField(param_3, "id", null);
      com.amazon.speech.ui.OutputSpeech outputSpeech = param_3;
      com.amazon.speech.ui.Reprompt param_0 = (com.amazon.speech.ui.Reprompt) Reflector.getInstance("com.amazon.speech.ui.Reprompt");
      Reflector.setField(param_0, "outputSpeech", null);
      com.amazon.speech.ui.Reprompt reprompt = param_0;

      /* Act */
      retval = com.amazon.speech.speechlet.SpeechletResponse.newAskResponse(outputSpeech, reprompt);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(Reflector.getInstanceField(retval, "outputSpeech"));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "outputSpeech"), "id")));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "outputSpeech"), "text")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "card"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "directives"));
      Assert.assertNotNull(Reflector.getInstanceField(retval, "reprompt"));
      Assert.assertEquals(null, Reflector.getInstanceField(Reflector.getInstanceField(retval, "reprompt"), "outputSpeech"));
      Assert.assertNotNull(Reflector.getInstanceField(retval, "shouldEndSession"));
      Assert.assertEquals(new Boolean(false), Reflector.getInstanceField(retval, "shouldEndSession"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 256 branch to line 257
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newAskResponse_a8b055558568345f_001() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      com.amazon.speech.ui.OutputSpeech outputSpeech = null;
      com.amazon.speech.ui.Reprompt param_0 = (com.amazon.speech.ui.Reprompt) Reflector.getInstance("com.amazon.speech.ui.Reprompt");
      Reflector.setField(param_0, "outputSpeech", null);
      com.amazon.speech.ui.Reprompt reprompt = param_0;

      /* Act */
      thrown.expect(IllegalArgumentException.class);
      retval = com.amazon.speech.speechlet.SpeechletResponse.newAskResponse(outputSpeech, reprompt);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 256 branch to line 260
   * conditional line 260 branch to line 261
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newAskResponse_a8b055558568345f_002() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      String param_5 = "";
      String param_3 = "";
      com.amazon.speech.ui.PlainTextOutputSpeech param_2 = (com.amazon.speech.ui.PlainTextOutputSpeech) Reflector.getInstance("com.amazon.speech.ui.PlainTextOutputSpeech");
      Reflector.setField(param_2, "text", param_5);
      Reflector.setField(param_2, "id", param_3);
      com.amazon.speech.ui.OutputSpeech outputSpeech = param_2;
      com.amazon.speech.ui.Reprompt reprompt = null;

      /* Act */
      thrown.expect(IllegalArgumentException.class);
      retval = com.amazon.speech.speechlet.SpeechletResponse.newAskResponse(outputSpeech, reprompt);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 206 branch to line 210
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newTellResponse_7b97ff73c8be0d95_000() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      com.amazon.speech.ui.PlainTextOutputSpeech param_0 = (com.amazon.speech.ui.PlainTextOutputSpeech) Reflector.getInstance("com.amazon.speech.ui.PlainTextOutputSpeech");
      Reflector.setField(param_0, "text", null);
      Reflector.setField(param_0, "id", null);
      com.amazon.speech.ui.OutputSpeech outputSpeech = param_0;

      /* Act */
      retval = com.amazon.speech.speechlet.SpeechletResponse.newTellResponse(outputSpeech);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(Reflector.getInstanceField(retval, "outputSpeech"));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "outputSpeech"), "id")));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "outputSpeech"), "text")));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "card"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "directives"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "reprompt"));
      Assert.assertNotNull(Reflector.getInstanceField(retval, "shouldEndSession"));
      Assert.assertEquals(new Boolean(true), Reflector.getInstanceField(retval, "shouldEndSession"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 206 branch to line 207
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newTellResponse_7b97ff73c8be0d95_001() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      com.amazon.speech.ui.OutputSpeech outputSpeech = null;

      /* Act */
      thrown.expect(IllegalArgumentException.class);
      retval = com.amazon.speech.speechlet.SpeechletResponse.newTellResponse(outputSpeech);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 230 branch to line 234
   * conditional line 234 branch to line 234
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newTellResponse_fc8156d826fc4067_000() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      com.amazon.speech.ui.PlainTextOutputSpeech param_3 = (com.amazon.speech.ui.PlainTextOutputSpeech) Reflector.getInstance("com.amazon.speech.ui.PlainTextOutputSpeech");
      Reflector.setField(param_3, "text", null);
      Reflector.setField(param_3, "id", null);
      com.amazon.speech.ui.OutputSpeech outputSpeech = param_3;
      com.amazon.speech.ui.AskForPermissionsConsentCard param_0 = (com.amazon.speech.ui.AskForPermissionsConsentCard) Reflector.getInstance("com.amazon.speech.ui.AskForPermissionsConsentCard");
      Reflector.setField(param_0, "permissions", null);
      Reflector.setField(param_0, "title", null);
      com.amazon.speech.ui.Card card = param_0;

      /* Act */
      retval = com.amazon.speech.speechlet.SpeechletResponse.newTellResponse(outputSpeech, card);
    }
    {
      /* Assert result */
      Assert.assertNotNull(retval);
      Assert.assertNotNull(Reflector.getInstanceField(retval, "outputSpeech"));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "outputSpeech"), "id")));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "outputSpeech"), "text")));
      Assert.assertNotNull(Reflector.getInstanceField(retval, "card"));
      Assert.assertEquals(null, ((String) Reflector.getInstanceField(Reflector.getInstanceField(retval, "card"), "title")));
      Assert.assertEquals(null, Reflector.getInstanceField(Reflector.getInstanceField(retval, "card"), "permissions"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "directives"));
      Assert.assertEquals(null, Reflector.getInstanceField(retval, "reprompt"));
      Assert.assertNotNull(Reflector.getInstanceField(retval, "shouldEndSession"));
      Assert.assertEquals(new Boolean(true), Reflector.getInstanceField(retval, "shouldEndSession"));
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 230 branch to line 231
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_newTellResponse_fc8156d826fc4067_001() throws Throwable {

    com.amazon.speech.speechlet.SpeechletResponse retval;
    {
      /* Arrange */
      com.amazon.speech.ui.PlainTextOutputSpeech param_2 = (com.amazon.speech.ui.PlainTextOutputSpeech) Reflector.getInstance("com.amazon.speech.ui.PlainTextOutputSpeech");
      Reflector.setField(param_2, "text", null);
      Reflector.setField(param_2, "id", null);
      com.amazon.speech.ui.OutputSpeech outputSpeech = param_2;
      com.amazon.speech.ui.Card card = null;

      /* Act */
      thrown.expect(IllegalArgumentException.class);
      retval = com.amazon.speech.speechlet.SpeechletResponse.newTellResponse(outputSpeech, card);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_setCard_57cf7112b4df389e_000() throws Throwable {

    {
      /* Arrange */
      com.amazon.speech.speechlet.Directive [] dynamic_30_array = new com.amazon.speech.speechlet.Directive []{ null, null };
      com.amazon.speech.speechlet.Directive [] param_3 = dynamic_30_array;

      java.util.ArrayList param_2 = new java.util.ArrayList();

      com.amazon.speech.speechlet.SpeechletResponse param_1 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_1, "shouldEndSession", null);
      Reflector.setField(param_1, "outputSpeech", null);
      Reflector.setField(param_1, "card", null);
      Reflector.setField(param_1, "directives", param_2);
      Reflector.setField(param_1, "reprompt", null);
      com.amazon.speech.ui.Card card = null;

      /* Act */
      param_1.setCard(card);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_setDirectives_db01d2ae5060f88c_000() throws Throwable {

    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_1 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_1, "shouldEndSession", null);
      Reflector.setField(param_1, "outputSpeech", null);
      Reflector.setField(param_1, "card", null);
      Reflector.setField(param_1, "directives", null);
      Reflector.setField(param_1, "reprompt", null);
      java.util.List<com.amazon.speech.speechlet.Directive> directives = null;

      /* Act */
      param_1.setDirectives(directives);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_setNullableShouldEndSession_df682dbbc871b5fb_000() throws Throwable {

    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_1 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_1, "shouldEndSession", null);
      Reflector.setField(param_1, "outputSpeech", null);
      Reflector.setField(param_1, "card", null);
      Reflector.setField(param_1, "directives", null);
      Reflector.setField(param_1, "reprompt", null);
      Boolean shouldEndSession = null;

      /* Act */
      param_1.setNullableShouldEndSession(shouldEndSession);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_setOutputSpeech_35b76c9ac41d3c5b_000() throws Throwable {

    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_1 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_1, "shouldEndSession", null);
      Reflector.setField(param_1, "outputSpeech", null);
      Reflector.setField(param_1, "card", null);
      Reflector.setField(param_1, "directives", null);
      Reflector.setField(param_1, "reprompt", null);
      com.amazon.speech.ui.OutputSpeech outputSpeech = null;

      /* Act */
      param_1.setOutputSpeech(outputSpeech);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_setReprompt_1fc15022734523ef_000() throws Throwable {

    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_1 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_1, "shouldEndSession", null);
      Reflector.setField(param_1, "outputSpeech", null);
      Reflector.setField(param_1, "card", null);
      Reflector.setField(param_1, "directives", null);
      Reflector.setField(param_1, "reprompt", null);
      com.amazon.speech.ui.Reprompt reprompt = null;

      /* Act */
      param_1.setReprompt(reprompt);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_SpeechletResponse_setShouldEndSession_3ced9b066e9b318b_000() throws Throwable {

    {
      /* Arrange */
      com.amazon.speech.speechlet.SpeechletResponse param_1 = (com.amazon.speech.speechlet.SpeechletResponse) Reflector.getInstance("com.amazon.speech.speechlet.SpeechletResponse");
      Reflector.setField(param_1, "shouldEndSession", null);
      Reflector.setField(param_1, "outputSpeech", null);
      Reflector.setField(param_1, "card", null);
      Reflector.setField(param_1, "directives", null);
      Reflector.setField(param_1, "reprompt", null);
      boolean shouldEndSession = false;

      /* Act */
      param_1.setShouldEndSession(shouldEndSession);

      /* Method return type is void, or not expected to return */
    }
  }
}
