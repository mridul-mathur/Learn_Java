package Notes.Linklist;

public class LL {
    private NodeBox head;

    private NodeBox tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public int size() {
        NodeBox temp = head;
        size = 0;
        while (temp != null) {
            temp = temp.next;
            size += 1;
        }
        return size;
    }

    public void display() {
        NodeBox temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
            size += 1;
        }
        System.out.println("null");
    }

    public NodeBox get(int index) {
        NodeBox node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertFirst(int val) {
        NodeBox newnode = new NodeBox(val);
        newnode.next = head;
        head = newnode;

        if (tail == null) {
            tail = head;
        }
        tail.next = null;
        size = size();
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        NodeBox newnode = new NodeBox(val);
        tail.next = newnode;
        tail = newnode;
        tail.next = null;
        size = size();
        size += 1;
    }

    public void insert(int index, int val) {
        if (index == 0) {
            insertFirst(val);
        } else if (index == size) {
            insertLast(val);
        } else {
            NodeBox temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            NodeBox node = new NodeBox(val, temp.next);
            temp.next = node;
            size = size();
            size += 1;
        }
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size = size();
        size -= 1;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        NodeBox secondLast = get(size - 1);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size = size();
        size -= 1;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        NodeBox prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size = size();
        size -= 1;
        return val;
    }

    private class NodeBox {
        private final int value;
        private NodeBox next;

        public NodeBox(int value) {
            this.value = value;
        }

        public NodeBox(int value, NodeBox next) {
            this.value = value;
            this.next = next;
        }
    }
}
