package com.selflearning.Assignment1;

import java.lang.reflect.Method;

/* Q 26. Invoke private methods of some other class using reflection.
*/

class SecretClass {
    private void secretMethod(String message) {
        System.out.println("Secret method invoked! Message: " + message);
    }
}

public class Q26ReflectionDemo {
    public static void main(String[] args) {
        try {
            SecretClass obj = new SecretClass();

            Method method = SecretClass.class.getDeclaredMethod("secretMethod", String.class);

            method.setAccessible(true);

            method.invoke(obj, "Hello Reflection!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}