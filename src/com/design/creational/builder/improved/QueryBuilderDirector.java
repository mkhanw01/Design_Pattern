package com.design.creational.builder.improved;

/**
 * Created by khan on 3/9/18.
 */
public class QueryBuilderDirector {
  /**
   *
   * @param from
   * @param where
   * @param queryBuilder
   * @return
   */
  public Query buildQuery(String from, String where, QueryBuilder queryBuilder) {
    queryBuilder.from(from);
    queryBuilder.where(where);
    return queryBuilder.getQuery();
  }
}
