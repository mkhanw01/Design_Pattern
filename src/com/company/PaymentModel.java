package com.company;

import java.io.Serializable;

/**
 * Created by khan on 5/23/17.
 */
public class PaymentModel implements Serializable{
  private static final long serialVersionUID = -8785000848648126061L;
  private String name;
  private String age;
  private String sex;
  private String address;
  private String phoneNumber;

  public PaymentModel() {
    // nothing to do
  }

  public PaymentModel(String name, String age, String sex, String address) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.address = address;
  }

  public PaymentModel(String name, String age, String sex, String address, String phoneNumber) {
    this.phoneNumber = phoneNumber;
    new PaymentModel(name,age,sex,address);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("PaymentModel{");
    sb.append("name='").append(name).append('\'');
    sb.append(", age='").append(age).append('\'');
    sb.append(", sex='").append(sex).append('\'');
    sb.append(", address='").append(address).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
