package Week1_DesignPrinciplesAndPattern_HandsOn.HandsOn_FactoryMethodPattern.Code;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}
