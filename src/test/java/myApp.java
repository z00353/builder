public class myApp {
public static void main(String[] args) {
     // Creating a Director object
     // and configuring it with a Builder1 object.
     Director director = new Director(new Builder1());
     // Calling construct on the director.
     System.out.println(director.construct());
     }
}