package com.xxxifan.kotlinplayground.nulls;

import kotlin.Pair;

/**
 * Created by BobPeng on 2017/11/12.
 */

public class JavaUse {
  public void play() {
    Pair<String, Boolean> pair = new Pair<>("first", true);
    KotlinUtil.Companion.init(pair);
    KotlinUtil.init(pair);
    Singleton.getApp();
  }
}
