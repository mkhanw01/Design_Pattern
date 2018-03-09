package com.company;

import java.util.Collections;
import java.util.List;

/**
 * Created by khan on 2/10/17.
 */
public class StramCode {
  public static final String ALOK = "alok";
  public static final String CHAKRI = "chakri";
  public static final String HARI = "hari";
  public static final String NATARAJ = "nataraj";
  public static final String MANISHA = "manisha";
  public static final String JUGAL = "jugal";

  public static void main(String[] a) {
  /*  Random random = new Random();
    List<Integer> integerList = Arrays.asList(1, 3, 2, 4, 3, 2, 4, 10, -3);
    Object[] array = integerList.toArray();
    Arrays.stream(array).distinct().forEach(s -> System.out.print(" " + s));
    // objectStream.forEach(s->System.out.print(" "+s));
    List<Integer> squareList = integerList.stream().map(integer -> (integer * integer)).distinct()
        .collect(Collectors.toList());
    List<String> stringList =
        Arrays.asList("abc", "def", "hellow", "jkl", "mno", "pqr", "stu", "wxy", "end");
    List<String> strings = Arrays.asList(ALOK, CHAKRI, HARI, NATARAJ, MANISHA, JUGAL);

    Supplier<PersionEntity> persionEntitySupplier = PersionEntity::new;
    persionEntitySupplier.get();
  */
 /* Consumer<PersionEntity> persionEntityConsumer = persionEntity -> System.out.println
        (persionEntity.getFirstName());
    persionEntityConsumer.accept(new PersionEntity("100","waseem"));
*/
    /*Predicate<String> stringPredicate = (m)-> m.length()>3;
    Predicate<Boolean> booleanPredicate = Objects::nonNull;
    Predicate<Boolean> booleanPredicate1 = Objects::isNull;

    Function<String,Integer> stringIntegerFunction = Integer::valueOf;
    System.out.println(stringPredicate.negate().test(strings.get(0)));
    System.out.println("");
    System.out.println(stringPredicate.test(strings.get(0)));
    System.out.println("");
    System.out.println(booleanPredicate.test(Boolean.valueOf(strings.get(2))));
    System.out.println("");
    System.out.println(booleanPredicate1.test(Boolean.valueOf(strings.get(2))));
*/
/*

    sortStrings(strings);
    for (String print:
         strings) {

      System.out.println(print);
    }
*/
  /*  int count = (int) stringList.stream().filter(s -> s.equals("hellow")).count();
    List<String> filtered =
        stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
    String mergeString =
        stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
    System.out.println("");
    System.out.print(" " + mergeString);
    System.out.println("");
    System.out.print(" filter count value==" + count);
    System.out.println(" ");
    for (String str : filtered) {
      System.out.print(" " + str);
    }
    System.out.println(" ");
    random.ints().limit(5).forEach(System.out::print);
    System.out.println(" ");
    for (Integer i : squareList) {
      System.out.print(" " + i);
    }
  */}

  private static void sortStrings(List<String> strings) {
    Collections.sort(strings,(String first,String second)->
       first.compareTo(second));
  }
}
