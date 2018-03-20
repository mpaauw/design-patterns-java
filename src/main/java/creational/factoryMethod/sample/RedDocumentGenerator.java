package creational.factoryMethod.sample;

public class RedDocumentGenerator implements DocumentGenerator {
    public Document generateDocument(DocumentType docType) {
        return new RedDocument(docType);
    }
}
