package main.java;

public class MyClass {
    public static void main(String[] args) {

        // System.out.println(getCallerClassAndMethodName());
       // m1();
    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }

    public static String getCallerClassAndMethodName() {
        //public static String getCallerClassAndMethodName() {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();//Thread.currentThread().getStackTrace();
            String message = "";
            if(stackTraceElements.length >= 3) {
                StackTraceElement element = stackTraceElements[2];
                String className = element.getClassName();
                String methodName = element.getMethodName();
                message = className + ": " + methodName;
            } else {
                message = "null";
            }
            return message;
        }
    }