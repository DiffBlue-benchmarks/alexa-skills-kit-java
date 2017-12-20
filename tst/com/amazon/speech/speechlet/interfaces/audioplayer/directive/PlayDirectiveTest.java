package com.amazon.speech.speechlet.interfaces.audioplayer.directive;

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

public class PlayDirectiveTest {

  @org.junit.Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: PlayDirective */


  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_directive_PlayDirective__init__da6a38600f19383f_000() throws Throwable {

    com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective instance;
    {
      /* Act */
      /* Creating object to test constructor */
      instance = new com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective();

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_directive_PlayDirective_getAudioItem_1eb5f83e6fffa2a7_000() throws Throwable {

    com.amazon.speech.speechlet.interfaces.audioplayer.AudioItem retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective param_0 = (com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective");
      Reflector.setField(param_0, "audioItem", null);
      Reflector.setField(param_0, "playBehavior", null);

      /* Act */
      retval = param_0.getAudioItem();
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
  public void com_amazon_speech_speechlet_interfaces_audioplayer_directive_PlayDirective_getPlayBehavior_8f0ffeeeedfed1e1_000() throws Throwable {

    com.amazon.speech.speechlet.interfaces.audioplayer.PlayBehavior retval;
    {
      /* Arrange */
      com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective param_0 = (com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective");
      Reflector.setField(param_0, "audioItem", null);
      Reflector.setField(param_0, "playBehavior", null);

      /* Act */
      retval = param_0.getPlayBehavior();
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
  public void com_amazon_speech_speechlet_interfaces_audioplayer_directive_PlayDirective_setAudioItem_e9311c23ee66e9f1_000() throws Throwable {

    {
      /* Arrange */
      com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective param_1 = (com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective");
      Reflector.setField(param_1, "audioItem", null);
      Reflector.setField(param_1, "playBehavior", null);
      com.amazon.speech.speechlet.interfaces.audioplayer.AudioItem audioItem = null;

      /* Act */
      param_1.setAudioItem(audioItem);

      /* Method return type is void, or not expected to return */
    }
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */

  @org.junit.Test
  public void com_amazon_speech_speechlet_interfaces_audioplayer_directive_PlayDirective_setPlayBehavior_737a4597d098460b_000() throws Throwable {

    {
      /* Arrange */
      com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective param_1 = (com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective) Reflector.getInstance("com.amazon.speech.speechlet.interfaces.audioplayer.directive.PlayDirective");
      Reflector.setField(param_1, "audioItem", null);
      Reflector.setField(param_1, "playBehavior", null);
      com.amazon.speech.speechlet.interfaces.audioplayer.PlayBehavior playBehavior = null;

      /* Act */
      param_1.setPlayBehavior(playBehavior);

      /* Method return type is void, or not expected to return */
    }
  }
}
