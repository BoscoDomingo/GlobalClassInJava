package Case1;

public class GlobalClass {
    private static String someID;
    private static int someNumber;

    //SINGLETON
    /*private static GlobalClass instanciacion;

    public static GlobalClass getInstance(int a) {
        if (instanciacion == null) {
            instanciacion = new GlobalClass(a);
        }
        return instanciacion;
    }
     private GlobalClass(int a) {
        someID = "a";
        someNumber = a;
    }
    */
    //NON-SINGLETON
    public GlobalClass(int a) {
        someID = "id";
        someNumber = a;
    }

    public static String getSomeID() {
        return someID;
    }

    public static int getSomeNumber() {
        return someNumber;
    }

    public static void setSomeID(String someID) {
        GlobalClass.someID = someID;
    }

    public static void setSomeNumber(int someNumber) {
        GlobalClass.someNumber = someNumber;
    }

}
