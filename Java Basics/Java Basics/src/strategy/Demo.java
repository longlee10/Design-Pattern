package strategy;

public class Demo {
    public static void main(String[] args) {
        var imgStorage = new ImageStorage(new JPEGCompressor(), new ContrastFilter());
        imgStorage.store("image1");
    }
}
