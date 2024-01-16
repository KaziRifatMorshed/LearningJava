// BUJHI NAI
public class ClassLoaderExample {
    public static void main(String args[]){
        Class<ClassLoaderExample> C = ClassLoaderExample.class;
        System.out.println(C.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
} // DONE
//jdk.internal.loader.ClassLoaders$AppClassLoader@4e0e2f2a
//null