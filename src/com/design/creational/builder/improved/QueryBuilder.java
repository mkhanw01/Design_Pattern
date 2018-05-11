package com.design.creational.builder.improved;

/**
 * Created by khan on 3/9/18.
 */
public interface QueryBuilder {
  void from(String from);
  void where(String where);
  Query getQuery();
}
