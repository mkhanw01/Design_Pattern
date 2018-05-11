package com.design.creational.builder.improved;

/**
 * Created by khan on 3/9/18.
 */
public class MongoDbQueryBuilder implements QueryBuilder {
  private MongoDbQuery  mongoDbQuery = new MongoDbQuery();
  @Override
  public void from(String from) {

  }

  @Override
  public void where(String where) {

  }

  @Override
  public Query getQuery() {
    return null;
  }
}
