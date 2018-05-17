package com.tranning;


import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * @author waseem.khan since 5/17/18.
 */
public class NonRelationalDataBaseConnectionApp {

  private static final String DBNAME = "testdata";

  private void connect() {
    MongoClient mongoClient;
    try {
      mongoClient = new MongoClient("localhost", 27017);
      System.out.println(
          "successFully  connected with mongo database with db: " + mongoClient.getDB(DBNAME)
              .getName());
    } catch (UnknownHostException e) {
      System.out.println(e.getMessage());
    }

  }

  public static void main(String[] args) throws UnknownHostException {
    NonRelationalDataBaseConnectionApp connectionApp = new NonRelationalDataBaseConnectionApp();
    connectionApp.connect();
  }
}
