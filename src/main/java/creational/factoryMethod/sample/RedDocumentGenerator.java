package creational.factoryMethod.sample;

public class RedDocumentGenerator implements DocumentGenerator {
    @Override
    public Document generateDocument(DocumentType docType) {
        return new RedDocument(docType);
    }
}
