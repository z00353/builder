public class Director {
    private ComplexObject co;
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String construct() {
        System.out.println("Director: Requesting the construction of complex object -> to builder object");
        builder.buildPartA();
        builder.buildPartB();
        co = builder.getResult();
        return "Hello World from " + co.getParts() + " objects!";
    }
}
