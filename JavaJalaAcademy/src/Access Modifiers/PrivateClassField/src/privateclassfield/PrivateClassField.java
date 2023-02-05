
package privateclassfield;

import java.lang.reflect.*;
public class PrivateClassField {
     // private variables
  private String name;

  // private method
  private void display() {
    System.out.println("The name is " + name);
  }


    public static void main(String[] args) {
        try {
      // create an object of PrivateClassField
      PrivateClassField test = new PrivateClassField();

      // create an object of the class named Class
      Class obj = test.getClass();

      // access the private variable
      Field field = obj.getDeclaredField("name");
      // make private field accessible
      field.setAccessible(true);

      // set value of field
      field.set(test, "Jala");

      // get value of field
      // and convert it in string
      String value = (String)field.get(test);
      System.out.println("Name: " + value);

      // access the private method
      Method[] methods = obj.getDeclaredMethods();
      System.out.println("Method Name: " + methods[0].getName());
      int modifier = methods[0].getModifiers();
      System.out.println("Access Modifier: " + Modifier.toString(modifier));

    }
    catch(Exception e) {
      e.printStackTrace();
    }
    
        
    }
    
}

