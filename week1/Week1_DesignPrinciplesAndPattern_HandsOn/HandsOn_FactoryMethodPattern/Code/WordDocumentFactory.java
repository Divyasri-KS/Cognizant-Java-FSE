package Week1_DesignPrinciplesAndPattern_HandsOn.HandsOn_FactoryMethodPattern.Code;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
