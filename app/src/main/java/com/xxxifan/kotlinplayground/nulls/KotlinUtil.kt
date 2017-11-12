package com.xxxifan.kotlinplayground.nulls

/**
 * Created by BobPeng on 2017/11/12.
 */
class KotlinUtil {

  companion object {
    @JvmOverloads
    @JvmStatic
    fun init(a: Int = 0, pair: Pair<String, Boolean>, receiver: (() -> Unit)? = null) {
      receiver?.invoke()
    }

    fun convert(int: Int): Char {
      return int.toChar()
    }
  }

}

object Singleton {
  @JvmStatic
  val APP: KotlinUtil = KotlinUtil()
    @JvmName("getApp") get
}

class KotlinUse {
  fun play() {
    val pair = "number" to true
    KotlinUtil.init(pair = pair)
  }
}