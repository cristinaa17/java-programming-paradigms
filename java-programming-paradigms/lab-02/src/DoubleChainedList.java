
public class DoubleChainedList implements MyList {
    private DoubleChainedNode head;

    public DoubleChainedList() {
        this.head = null;
    }

    @Override
    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            DoubleChainedNode temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
            newNode.setPrevNode(temp);

        }
    }

    @Override
    public DoubleChainedNode getNodeByValue(int value) {
        DoubleChainedNode temp = head;
        while (temp != null) {
            if (temp.getValue() == value) {
                return temp;
            }
            temp = temp.getNextNode();
        }
        return null;
    }

    @Override
    public void removeNodeByValue(int value) {
        if (head == null) return;

        if (head.getValue() == value) {
            head = head.getNextNode();
            if (head != null) {
                head.setPrevNode(null);
            }
            return;
        }

        DoubleChainedNode temp = head;
        while (temp != null) {
            if (temp.getValue() == value) {
                if (temp.getNextNode() != null) {
                    temp.getNextNode().setPrevNode(temp.getPrevNode());
                }
                if (temp.getPrevNode() != null) {
                    temp.getPrevNode().setNextNode(temp.getNextNode());
                }
                return;
            }
            temp = temp.getNextNode();
        }
    }

    @Override
    public void listNodes() {
        DoubleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " <-> ");
            temp = temp.getNextNode();
        }
        System.out.println("null");
    }

    @Override
    public int sumValues() {
        int sum = 0;
        DoubleChainedNode temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNextNode();
        }
        return sum;
    }

    @Override
    public boolean isSorted() {
        if (head == null) return true;

        DoubleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }
}