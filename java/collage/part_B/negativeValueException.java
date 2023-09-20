public class program1
{
    public static void main(String []args)
    {
        try{
        int []array=new int[-7];
        }
        catch(NegativeArraySizeException neg)
        {
            neg.printStackTrace();
            //neg.printStackTrace();
        }
        System.out.println("continuing......");
    }
}
/*
C:\Users\ASUS\Desktop\projects\programming\java\collage>java negativeValueException.java
java.lang.NegativeArraySizeException: -7
        at program1.main(negativeValueException.java:6)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:577)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:421)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:192)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:132)
continuing......
*/