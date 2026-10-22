public class Application {
    public static void main(String[] args) {
        MyList list1 = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            list1.addValue(i);
        }
        list1.removeNodeByValue(4);
        list1.removeNodeByValue(6);
        list1.removeNodeByValue(8);
        list1.removeNodeByValue(10);
        list1.listNodes();
        System.out.println("Suma valorilor in lista simplu inlantuita: " + list1.sumValues());
        System.out.println("Lista simplu inlantuita este ordonata? " + list1.isSorted());

        MyList list2 = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) {
            list2.addValue(i);
        }
        list2.removeNodeByValue(1);
        list2.removeNodeByValue(2);
        list2.removeNodeByValue(3);
        list2.listNodes();
        System.out.println("Suma valorilor in lista dublu inlantuita: " + list2.sumValues());
        System.out.println("Lista dublu inlantuita este ordonata? " + list2.isSorted());
    }
}