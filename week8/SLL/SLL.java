package SLL;

public class SLL {

    private SLLNode head;
    private Integer length;

    public SLL() {
        this.head = null;
        this.length = 0;
    }

    public Boolean iterate() {

        if (this.head == null) {
            return false;
        }

        SLLNode runner = this.head;

        while (runner != null) {
            System.out.print(String.format("%d -> ", runner.getValue()));
            runner = runner.getNext();
            
        }

        System.out.print("null");

        return true;
        
    }

    public void addToFront(Integer val) {

        SLLNode newNode = new SLLNode(val);

        if (this.head == null) {
            this.head = newNode;
        } else {
            SLLNode temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }

    }


    // Getters and Setters

    public SLLNode getHead() {
        return head;
    }

    public void setHead(SLLNode head) {
        this.head = head;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

   

} 