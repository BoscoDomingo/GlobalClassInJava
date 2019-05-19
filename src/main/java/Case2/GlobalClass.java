package Case2;

public class GlobalClass implements IGlobal {
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
        someID = "id";
        someNumber = a;
    }
    */

    //NON-SINGLETON
    public GlobalClass(int a) {
        someID = "id";
        someNumber = a;
    }

    @Override
    public String getSomeID() {
        return someID;
    }

    @Override
    public int getSomeNumber() {
        return someNumber;
    }

    @Override
    public void setSomeID(String someID) {
        GlobalClass.someID = someID;
    }

    @Override
    public void setSomeNumber(int someNumber) {
        GlobalClass.someNumber = someNumber;
    }

}
