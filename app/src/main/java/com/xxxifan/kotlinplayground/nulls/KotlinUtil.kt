package com.xxxifan.kotlinplayground.nulls

/**
 * Created by BobPeng on 2017/11/12.
 */
class KotlinUtil {

  companion object {
    fun init(a: Int = 0, pair: Pair<String, Boolean>, receiver: (() -> Unit)? = null) {
      receiver?.invoke()
    }

    fun convert(int: Int): Char {
      return int.toChar()
    }
  }

}

object Singleton {
  val app: KotlinUtil = KotlinUtil()
}

class KotlinUse {
  fun play() {

  }
}