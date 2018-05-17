package com.tranning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author waseem.khan since 5/17/18.
 */
public class RelationalDataBaseConnectionApp {

  private static final String URL = "jdbc:postgresql://127.0.0.1:5433/hrms";
  private static final String USER_NAME = "postgres";
  private static final String PASSWORD = "coviam";
  private static final String CLASS_NAME = "org.postgresql.Driver";


  public Connection connect() throws SQLException {
    Connection conn = null;
    try {
      Class.forName(CLASS_NAME);
      conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
      System.out.println("Connected to the PostgreSQL server successfully.");
    } catch (SQLException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
    return conn;
  }

  public static void main(String[] args) throws SQLException {
    RelationalDataBaseConnectionApp application = new RelationalDataBaseConnectionApp();
    application.connect();
  }
}
