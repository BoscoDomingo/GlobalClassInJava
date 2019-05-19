package Case2;

public class Main {
    public static void main(String[] args) {
        //IGlobal sistema = GlobalClass.getInstance(1); //singleton

        IGlobal sistema = new GlobalClass(1);

        System.out.println("sistema.getSomeID: " + sistema.getSomeID());
        System.out.println("sistema.getSomeNumber : " + sistema.getSomeNumber());
        System.out.println("Multiplay by ten " + new ThirdParty().multiplyByTen()); //where new GlobalClass(5) is called
        System.out.println("sistema.getSomeNumber : " + sistema.getSomeNumber());

        //The variable someNumber is reassigned in new GlobalClass(5), so all objects share the same value, even
        // though they are different instances. Should use singleton if all variables are static
    }
}