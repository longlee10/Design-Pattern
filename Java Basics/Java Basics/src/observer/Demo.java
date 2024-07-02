package observer;

public class Demo {
    public static void main(String[] args) {
        var source = new DataSource();

        var sheet = new SpreadSheet(source);
        var chart = new Chart(source);

        source.addObserver(sheet);
        source.addObserver(chart);

        source.setValue(5);

        source.removeObserver(chart);
        source.setValue(3);
    }
}
