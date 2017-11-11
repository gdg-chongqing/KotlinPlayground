package com.xxxifan.kotlinplayground.nulls

/**
 * Created by BobPeng on 2017/11/12.
 */
class KotlinNull {

  fun show(student: Student?) {
  }

  class Student(val id: Int, val name: String, var email: String?, val isBoy: Boolean)

}