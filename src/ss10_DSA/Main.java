package ss10_DSA;

public class Main { public static void main(String[] args) {
    MyLinkedList<String> list = new MyLinkedList<>();

    list.addFirst("C");
    list.addFirst("B");
    list.addFirst("A");

    list.addLast("D");

    list.add(2, "X");

    System.out.print("Danh sách: ");
    list.printList();

    System.out.println("Phần tử đầu tiên: " + list.getFirst());
    System.out.println("Phần tử cuối cùng: " + list.getLast());
    System.out.println("Phần tử tại vị trí 2: " + list.get(2));
    System.out.println("Danh sách có chứa 'C' không? " + list.contains("C"));
    System.out.println("Vị trí của 'C': " + list.indexOf("C"));

    list.remove("X");
    list.remove(0);

    System.out.print("Danh sách sau khi xóa: ");
    list.printList();

    System.out.println("Số phần tử trong danh sách: " + list.size());

    MyLinkedList<String> cloneList = list.clone();
    System.out.print("Danh sách clone: ");
    cloneList.printList();
}
}
