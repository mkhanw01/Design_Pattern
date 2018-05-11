package com.design.creational.builder;

import lombok.Data;

/**
 * Created by khan on 3/9/18.
 */
@Data
public class MongoDbQuery implements Query {

  private String from;
  private String where;

  @Override
  public void execute() {
    System.out.println("Executing mongoQuery from: "+from+" where: "+where);
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getWhere() {
    return where;
  }

  public void setWhere(String where) {
    this.where = where;
  }
}
