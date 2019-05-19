package Case3;

public class ThirdParty {
    private int ten = 10;

    //case1
    public int multiplyByTen() {
        IGlobal sistema = GlobalClass.getInstance(5); //doesn't matter what number you put here, it is ignored
        return sistema.getSomeNumber() * this.ten;
    }
}
