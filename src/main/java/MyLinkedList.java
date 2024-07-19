
public class MyLinkedList {
    Node head;
    int length;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        if (head == null || index >= length) {
            return -1;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) { // use a for-loop for clarity
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        }
        if (index == 0) {
            head = head.next;
            length--;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        length--;
    }
}

