package lesson11.linkedlist;

public class XMergeApp {

  XLinkedList.XItem merge(XLinkedList xl1,
                          XLinkedList xl2) {
    XLinkedList.XItem head1 = xl1.getHead();
    XLinkedList.XItem head2 = xl2.getHead();

    return null;
  }

  private void print(XLinkedList.XItem merged) {

  }

  public static void main(String[] args) {
    XMergeApp app = new XMergeApp();
    XLinkedList xl1 = new XLinkedList();
    XLinkedList xl2 = new XLinkedList();
    xl1.add(1);
    xl1.add(4);
    xl1.add(5);
    xl1.add(7);
    xl1.add(9);
    xl2.add(2);
    xl2.add(3);
    xl2.add(6);
    xl2.add(8);
    XLinkedList.XItem merged = app.merge(xl1, xl2);
    app.print(merged);

  }

}
