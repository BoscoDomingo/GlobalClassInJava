package Case2;

public class ThirdParty {
    private int ten = 10;

    public int multiplyByTen(){
        IGlobal sistema = new GlobalClass(5);
        return sistema.getSomeNumber() * this.ten;
    }

}
