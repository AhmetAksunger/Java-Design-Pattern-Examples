package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {

        StringCollection stringCollection = new StringCollection();
        Iterator<String> iterator = stringCollection.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.reset();
        stringCollection.add("f");
        stringCollection.remove("a");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
