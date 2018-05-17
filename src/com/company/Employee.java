package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author waseem.khan since 5/16/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
  private String name;

  private String age;

  private String sex;

  private String address;

}
