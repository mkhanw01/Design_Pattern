package com.company;

import java.text.DecimalFormat;

/**
 * Created by khan on 4/10/18.
 */
public class RoundOffTest {

  private static final DecimalFormat decimalFormat = new DecimalFormat("###,###");
  private static final ThreadLocal<DecimalFormat> FORMAT_THREAD_LOCAL =
      ThreadLocal.withInitial(() -> new DecimalFormat("###,###"));

  public static void main(String[] args) {

    Double number3 = 1876.675;

    int x = number3.intValue();
    Long longValue = 123764l;

    double num1 = 1050.997;
    double num2 = 1505.078;

    System.out.println("math ceil value " + Math.ceil(number3));

    System.out.println(x);

    System.out.println(num1);


    System.out.println("formatted value for decimal " + decimalFormat.format(num1));
    System.out.println("formatted value for Double " + decimalFormat.format(number3));
    System.out.println("formated value for long " + decimalFormat.format(longValue));
    System.out.println("formated value with both doubleVlaue " + decimalFormat.format(num1 + num2));

  }

}
