//DEFAULT DATA TYPES
package datatypes;
public class DataTypesExample {
    //Instance variables: non static
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean boolValue;

    static int age= 25; // static variable

    public static void main(String[] args) {
        DataTypesExample dataTypesExample = new DataTypesExample(); // Reference variable: object creation
        DataTypesExample obj2 = new DataTypesExample();
        String name = "XYZ"; // local variable
        System.out.println("Default values of data types in java: ");
        System.out.println("name: " + name);
        System.out.println("Byte Value: " + dataTypesExample.byteValue);
        System.out.println("short Value: " + dataTypesExample.shortValue);
        System.out.println("integer Value: " + dataTypesExample.intValue);
        System.out.println("long Value: " + dataTypesExample.longValue);
        System.out.println("float Value: " + dataTypesExample.floatValue);
        System.out.println("double Value: " + dataTypesExample.doubleValue);
        System.out.println("char Value: " + dataTypesExample.charValue);
        System.out.println("boolean Value: " + dataTypesExample.boolValue);
    }
}

