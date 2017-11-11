package com.xxxifan.kotlinplayground.nulls;

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
    public int id;
    public String name;
    public String email;
    public boolean isBoy;

    public Student(int id, String name, String email, boolean isBoy) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.isBoy = isBoy;
    }
  }

}
