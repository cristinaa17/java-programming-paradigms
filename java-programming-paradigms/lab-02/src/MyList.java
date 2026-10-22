public interface MyList {
    boolean isSorted();
    void addValue(int value);
    void listNodes();
    Node getNodeByValue(int value);
    void removeNodeByValue(int value);
    int sumValues();
}