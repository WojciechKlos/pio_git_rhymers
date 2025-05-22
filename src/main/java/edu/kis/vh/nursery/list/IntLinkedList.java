package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int INVALID_VALUE = -1;
    private Node last;

    public void push(int i) {
        Node newNode = new Node(i);

        if (last == null)
            last = newNode;
        else {
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return INVALID_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return INVALID_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
