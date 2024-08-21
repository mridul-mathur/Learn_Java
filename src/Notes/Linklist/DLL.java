package Notes.Linklist;

public class DLL {

    private NodeBox head;

    private NodeBox tail;

    private int size;

    public void insertFirst(int val){
        NodeBox node =new NodeBox(val);
        node.next =head;
        node.prev =null;
        if (head != null){
            head.prev = null;
        }
        head = node;
    }

    public void display(){
        NodeBox node = head;

    }

    public DLL() {
        this.size = 0;
    }

    private class NodeBox {
        private int value;
        private NodeBox next;
        private NodeBox prev;

        public NodeBox(int value) {
            this.value = value;
        }

        public NodeBox(int value, NodeBox next, NodeBox prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
