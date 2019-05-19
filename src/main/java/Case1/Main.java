package Case1;

public class Main {
    public static void main(String[] args) {
        //GlobalClass globalClass = GlobalClass.getInstance(1); //singleton
        GlobalClass globalClass = new GlobalClass(1); //non-singleton

        System.out.println("GlobalClass.getSomeID: (class) " + GlobalClass.getSomeID() + " (object) " + globalClass.getSomeID());
        System.out.println("GlobalClass.getSomeNumber : (class) " + GlobalClass.getSomeNumber() + " (object) " + globalClass.getSomeNumber());
        System.out.println("Multiplay by ten "+ new ThirdParty().multiplyByTen());
        System.out.println("GlobalClass.getSomeNumber : (class) " + GlobalClass.getSomeNumber() + " (object) " + globalClass.getSomeNumber());
    }
}