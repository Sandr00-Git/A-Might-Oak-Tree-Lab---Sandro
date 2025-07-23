package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    @Test
    public void testNodeCreationAndLinks() {
        Squirrel a = new Squirrel("Alpha");
        Squirrel b = new Squirrel("Bravo");
        Squirrel c = new Squirrel("Charlie");

        Node nodeA = new Node(a);
        Node nodeB = new Node(b);
        Node nodeC = new Node(c);

        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeC);

        assertEquals("Bravo", nodeA.left().getData().getName());
        assertEquals("Charlie", nodeA.right().getData().getName());
    }
}
