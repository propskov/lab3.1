package Onelist;

public class Main {
    public static void main(String[] args) {
        Onelist lst = new Onelist();
        lst.addFront(1);
        lst.addBack(2);
        lst.addBack(3);
        lst.addBack(4);
        lst.printAll();
        System.out.println();

        lst.printList();
        System.out.println();

        lst.addFront(0);
        lst.printAll();
        System.out.println();

        lst.del(1);
        lst.printAll();
        System.out.println();

        lst.del(2);
        lst.del(3);
        lst.del(4);
        lst.printAll();
        System.out.println();

        lst.del(0);
        lst.printAll();
        System.out.println();

    }
}
