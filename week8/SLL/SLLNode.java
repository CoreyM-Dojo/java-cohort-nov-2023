package SLL;

public class SLLNode {
    
    private Integer value;
    private SLLNode next;

    public SLLNode(Integer val) {
        this.value = val;
        this.next = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    
}
