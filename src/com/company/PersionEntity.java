package com.company;

/**
 * Created by khan on 9/29/17.
 */
public class PersionEntity {
  private String id;
  private String firstName;
  private String lastName;
  private String age;
  private String sex;

  public PersionEntity() {
    /*
    Do Nothing
     */
  }

  public PersionEntity(String id, String firstName) {
    this.id = id;
    this.firstName = firstName;
  }

  public PersionEntity(String id, String firstName, String lastName, String age, String sex) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.sex = sex;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("PersionEntity{");
    sb.append("id='").append(id).append('\'');
    sb.append(", firstName='").append(firstName).append('\'');
    sb.append(", lastName='").append(lastName).append('\'');
    sb.append(", age='").append(age).append('\'');
    sb.append(", sex='").append(sex).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
