package lesson11.linkedlist;

import java.util.StringJoiner;

public class XMergeApp {

  XLinkedList.XItem merge(XLinkedList xl1,
                          XLinkedList xl2) {
    XLinkedList.XItem current1 = xl1.getHead();
    XLinkedList.XItem current2 = xl2.getHead();
    XLinkedList.XItem head;
    XLinkedList.XItem current;

    if (current1.value <= current2.value) {
      head = current1;
      current1 = current1.next;
    } else {
      head = current2;
      current2 = current2.next;
    }
    current = head;

    while (current1 != null && current2 != null) {
      if (current1.value <= current2.value) {
        current.next = current1;
        current1 = current1.next;
      } else {
        current.next = current2;
        current2 = current2.next;
      }
      current = current.next;
    }

    if (current1 != null) {
      current.next = current1;
    }

    if (current2 != null) {
      current.next = current2;
    }
    return head;
  }

  private void print(XLinkedList.XItem merged) {
    StringJoiner sj = new StringJoiner(",", "[", "]");
    while (merged != null) {
      sj.add(String.valueOf(merged.value));
      merged = merged.next;
    }
    System.out.println(sj.toString());
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
    xl1.add(100);
    xl1.add(200);
    xl2.add(2);
    xl2.add(3);
    xl2.add(6);
    xl2.add(8);
    System.out.println(xl1.toString());
    System.out.println(xl2.toString());
    XLinkedList.XItem merged = app.merge(xl1, xl2);
    app.print(merged);
  }
}
