package strategy;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG... " + fileName);
    }
}
