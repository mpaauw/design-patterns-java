package creational.factoryMethod;

import creational.factoryMethod.sample.*;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTests {

    @Test
    public void test() {
        DocumentGenerator docGenerator = new RedDocumentGenerator();
        Document document = docGenerator.generateDocument(DocumentType.Text);
        Class expected = RedDocument.class;
        Class actual = document.getClass();
        Assert.assertEquals(expected, actual);
    }

}
