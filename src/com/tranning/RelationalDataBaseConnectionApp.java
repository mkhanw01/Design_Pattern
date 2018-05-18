package com.tranning;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

/**
 * @author waseem.khan since 5/17/18.
 */
public class RelationalDataBaseConnectionApp {

  private static final String URL = "jdbc:postgresql://127.0.0.1:5433/hrms";
  private static final String USER_NAME = "postgres";
  private static final String PASSWORD = "coviam";
  private static final String CLASS_NAME = "org.postgresql.Driver";


  public void connect() throws SQLException {
    Connection conn = null;
    try {
      Class.forName(CLASS_NAME);
      conn = getConnection(URL, USER_NAME, PASSWORD);
      System.out.println("Connected to the PostgreSQL server successfully.");
      try (ResultSet resultSet = conn.prepareStatement("select * from department limit 5")
          .executeQuery()) {
        System.out.println(resultSet.getFetchSize());

      }
    } catch (SQLException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      conn.close();
    }
  }


  public static void main(String[] args) throws SQLException {
    RelationalDataBaseConnectionApp application = new RelationalDataBaseConnectionApp();
    application.connect();
  }
}
