public class Builder1 implements Builder {
    private ComplexObject co = new ComplexObject();
    public void buildPartA() {
        System.out.println("Builder1: Creating and assembling ProductA1.");
        co.add(new ProductA1());
    }

    public void buildPartB() {
        System.out.println("Builder1: Creating and assembling ProductB1.");
        co.add(new ProductB1());
    }

    public ComplexObject getResult() {
        return co;
    }
}
