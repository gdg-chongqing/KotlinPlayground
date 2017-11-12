package com.xxxifan.kotlinplayground.nulls

import android.content.Context
import android.view.View
import android.view.View.OnClickListener
import java.io.OutputStream
import java.util.jar.JarOutputStream

/**
 * Created by BobPeng on 2017/11/12.
 */
class Lambdas {

  fun clickListener(listener: (View) -> Unit) {
    listener(View(null))
  }

  fun testParams(listener: (View, Context) -> Unit) {
    listener()
  }

  fun using(outputStream: OutputStream, body: (OutputStream) -> Unit) {
    try {
      body(outputStream)
    } finally {
      outputStream.close()
    }
  }

  fun show() {
    val view = View(null)
    view.setOnClickListener(object: OnClickListener {
      override fun onClick(p0: View?) {
      }
    })
    view.setOnClickListener {

    }
    clickListener {

    }

    using(OutputStream()) {
      it.write(0)
    }

    OutputStream().use {

    }

  }
}