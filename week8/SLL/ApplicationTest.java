package SLL;

public class ApplicationTest {
    
    public static void main(String[] args) {
        SLL newList = new SLL();        
        SLLNode node1 = new SLLNode(1);
        newList.setHead(node1);
        newList.getHead().setNext(new SLLNode(2));
        newList.getHead().getNext().setNext(new SLLNode(3));
        newList.addToFront(0);
        newList.iterate();
    }
}
