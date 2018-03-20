package creational.factoryMethod;

import creational.factoryMethod.sample.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class FactoryMethodTests {

    @Test
    public void test() {
        DocumentGenerator docGenerator = new RedDocumentGenerator();
        Document document = docGenerator.generateDocument(DocumentType.Text);
        Class expected = RedDocument.class;
        Class actual = document.getClass();
        Assert.assertEquals(expected, actual);


    }

    public boolean pathExists(GraphNode source, GraphNode dest) {
        if(source == null || dest == null) {
            return false;
        }
        if(source == dest) {
            return true;
        }
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(source);
        while(!queue.isEmpty()) {
            GraphNode current = queue.remove();
            if(current == dest) {
                return true;
            }
            current.state = VisitState.Visiting;
            for(GraphNode child : current.children) {
                if(child != null) {
                    if(child.state == VisitState.Unvisited) {
                        queue.add(child);
                    }
                }
            }
            current.state = VisitState.Visited;
        }
        return false;
    }

    public class GraphNode {
        int data;
        GraphNode[] children;
        VisitState state;
    }

    public enum VisitState {
        Unvisited,
        Visiting,
        Visited
    }

}
