package Case1;

public class ThirdParty {
    private int ten = 10;

    public int multiplyByTen(){
        return GlobalClass.getSomeNumber() * this.ten;
    }
}
