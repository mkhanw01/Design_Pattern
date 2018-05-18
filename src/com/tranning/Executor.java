package com.tranning;

/**
 * @author waseem.khan since 5/17/18.
 */
public class Executor {

  private static final String NAME = "name";
  private static final String SINGELTONE = "singeltone";

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
   /* Teacher teacher = new Teacher();
    teacher.setFirstName(NAME);
    teacher.setSalary(100);
    System.out.println(teacher);

    Class aClass = teacher.getClass();

    System.out.println(aClass.getPackage());

    System.out.println(aClass.getCanonicalName());

    System.out.println(aClass.getSuperclass());

    System.out.println(Modifier.toString(aClass.getModifiers()));*/

   /* Method[] methods = aClass.getMethods();

    for(Method method: methods) {
      System.out.println(method );
    }
*/


   /* Field field1 = aClass.getDeclaredField("salary");
     field1.setAccessible(true);
    System.out.println(field1.get(teacher));
    field1.set(teacher, 500);
    System.out.println(field1.get(teacher));
*/
    Singeltone singeltone = Singeltone.getObject();
    singeltone.setName(SINGELTONE);
    System.out.println(singeltone);
  }

}
