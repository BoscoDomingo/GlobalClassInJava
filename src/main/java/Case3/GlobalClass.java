package Case3;

public class GlobalClass implements IGlobal {
    private String someID;
    private int someNumber;

    //SINGLETON ONLY
    private static GlobalClass instance;

    public static GlobalClass getInstance(int a) {
        if (instance == null) {
            instance = new GlobalClass(a);
        }
        return instance;
    }
     private GlobalClass(int a) {
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
        this.someID = someID;
    }

    @Override
    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber;
    }
}
