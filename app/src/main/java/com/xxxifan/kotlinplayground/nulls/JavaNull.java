package com.xxxifan.kotlinplayground.nulls;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by BobPeng on 2017/11/12.
 */

public class JavaNull {

  public void show(Student student) {
    if (student != null && student.email != null) {
      if (student.email.endsWith("@gmail")) {
        System.out.println("ok");
      }
    }
  }


  public static class Student {
    public final int id;
    public final String name;
    @Nullable public String email;
    public final boolean isBoy;

    public Student(int id, String name, @Nullable String email, boolean isBoy) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.isBoy = isBoy;
    }
  }

}
