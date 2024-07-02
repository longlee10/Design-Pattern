import java.TaxCalculator;
import java.TaxCalculator2023;
import java.UIControl;

public class Main {
    public static void main(String[] args) {
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2023();
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }
}