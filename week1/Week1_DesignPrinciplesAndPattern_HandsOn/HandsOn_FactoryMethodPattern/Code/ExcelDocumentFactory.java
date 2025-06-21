package Week1_DesignPrinciplesAndPattern_HandsOn.HandsOn_FactoryMethodPattern.Code;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

