package com.company;

import java.util.Optional;

/**
 * @author waseem.khan since 5/16/18.
 */

public class EmployeeInitializer {

  private Employee initializedValue(Employee employee) {
    employee.setAge(Optional.ofNullable(employee.getAge()).orElse("25"));
    employee.setName(Optional.ofNullable(employee.getName()).orElse(null));
    employee.setSex(Optional.ofNullable(employee.getSex()).orElse("Male"));
    employee.setAddress(Optional.ofNullable(employee.getAddress()).orElse("BLR"));
    return employee;
  }

  public static void main(String[] args) {
    Employee employee1 = new Employee();
    employee1.setName("khan");
    EmployeeInitializer initializer = new EmployeeInitializer();
    Employee employee = initializer.initializedValue(employee1);
    System.out.println("employee Age: "+employee.getAge()+" ,"+"employee Name: "+employee
        .getName()+" ,"+"employee Sex: "+ employee.getSex()+ " ,"+"employee Address: "+
        employee.getAddress());
  }
}
