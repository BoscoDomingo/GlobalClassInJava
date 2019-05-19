package Case3;

public class Main {
    public static void main(String[] args) {
        IGlobal sistema = GlobalClass.getInstance(1);
        System.out.println("sistema.getSomeID: " + sistema.getSomeID());
        System.out.println("sistema.getSomeNumber : " + sistema.getSomeNumber());
        System.out.println("Multiplay by ten " + new ThirdParty().multiplyByTen()); //where new GlobalClass(5) is called
        System.out.println("sistema.getSomeNumber : " + sistema.getSomeNumber());

        //Variable someNumber is NOT reassigned during new GlobalClass(5), since object already existed
    }
}