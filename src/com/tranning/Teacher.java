package com.tranning;

/**
 * @author waseem.khan since 5/17/18.
 */
public class Teacher {

  public String firstName;
  private int salary;

  public Teacher() {
    // do nothing
  }

  public Teacher(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Teacher{");
    sb.append("firstName='").append(firstName).append('\'');
    sb.append(", salary='").append(salary).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
