package com.xxxifan.kotlinplayground.nulls

import android.util.Log

/**
 * Created by BobPeng on 2017/11/12.
 */
class KotlinNull {

  fun show(student: Student?) {
    if (student?.email?.endsWith("@gmail.com") == true) {
      println("ok")
    }

    student?.learnSomething()

  }

  class Student(val id: Int, val name: String, var email: String?, val isBoy: Boolean) {
    fun learnSomething() {

    }
  }

}