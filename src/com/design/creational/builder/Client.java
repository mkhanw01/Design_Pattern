package com.design.creational.builder;

/**
 * Created by khan on 3/9/18.
 */
public class Client {
  public static void main(String[] args) {
    String from = "client table:";
    String where = "client name:";
    /**
     * crating  sqlQuery
     */
    SqlQuery sqlQuery = new SqlQuery();
    sqlQuery.setFrom(from);
    sqlQuery.setWhere(where);
    sqlQuery.execute();

    /**
     * creating mongoQuery
     */
    MongoDbQuery mongoDbQuery = new MongoDbQuery();
    mongoDbQuery.setFrom(from);
    mongoDbQuery.setWhere(where);
    mongoDbQuery.execute();

    /**
     * On the above we are creating two times for the same type of task
     * one time for sql and another time for mongo
     * taht we can be resolve by Builder pattern.
     */
  }
}
