import java.util.*;

public class ComplexObject {
    private List<Product> listOfChildren = new ArrayList<Product>();

    public  String getParts() {
        Iterator<Product> i = listOfChildren.iterator();
        String str = "ComplexObject made up of: ";
        while (i.hasNext()) {
            str += i.next().getName();
        }
        return str;
    }

    public boolean add(Product child) {
        return listOfChildren.add(child);
    }

//    public Iterator<Product> iterator() {
//        return listOfChildren.iterator();
//
//    }
}
