package iterator;

public class Demo {
    public static void main(String[] args) {
        var browseHistory = new BrowseHistory();

        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        var iterator = browseHistory.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
