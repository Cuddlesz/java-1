package cn.sdu.edu.sc.java.chapt12.doublelinked;
/**
 * �Ը��ӵ�˫������
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2008.12.19
 */


class Node
{
  Object value;
  Node prev = this;
  Node next = this;

  Node(Object v)
  {
    value = v;
  }

  public String toString()
  {
    return value.toString();
  }
}

public class DoubleLinkedList
{
  // �ڵ���Node

  private Node head = new Node(null); // ͷ�ڵ�
  private int size; // �����С
  // �����ǽӿڷ���

  public boolean addFirst(Object o)
  {
    addAfter(new Node(o), head);
    return true;
  }

  public boolean addLast(Object o)
  {
    addBefore(new Node(o), head);
    return true;
  }

  public boolean add(Object o)
  {
    return addLast(o);
  }

  public boolean add(int index, Object o)
  {
    addBefore(new Node(o), getNode(index));
    return true;
  }

  public boolean remove(int index)
  {
    removeNode(getNode(index));
    return true;
  }

  public boolean removeFirst()
  {
    removeNode(head.next);
    return true;
  }

  public boolean removeLast()
  {
    removeNode(head.prev);
    return true;
  }

  public Object get(int index)
  {
    return getNode(index).value;
  }

  public int size()
  {
    return size;
  }

  public String toString()
  {
    StringBuffer s = new StringBuffer("[");
    Node node = head;
    for (int i = 0; i < size; i++)
    {
      node = node.next;
      if (i > 0)
        s.append(", ");
      s.append(node.value);
    }
    s.append("]");
    return s.toString();
  }
  //������ʵ�ַ���

  private Node getNode(int index)
  {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException();
    Node node = head.next;
    for (int i = 0; i < index; i++)
      node = node.next;
    return node;
  }

  private void addBefore(Node newNode, Node node)
  {
    newNode.next = node;
    newNode.prev = node.prev;
    newNode.next.prev = newNode;
    newNode.prev.next = newNode;
    size++;
  }

  private void addAfter(Node newNode, Node node)
  {
    newNode.prev = node;
    newNode.next = node.next;
    newNode.next.prev = newNode;
    newNode.prev.next = newNode;
    size++;
  }

  private void removeNode(Node node)
  {
    node.prev.next = node.next;
    node.next.prev = node.prev;
    node.prev = null;
    node.next = null;
    size--;
  }
  public static void main(String[] args)
  {
    DoubleLinkedList dll = new DoubleLinkedList();
    //���
    dll.add("Tom");
    dll.add("Jerry");
    dll.add("Dahogn");
    System.out.println(dll);

    //��ӵ���ǰ
    dll.addFirst("Firt");
    System.out.println(dll);

    //��ӵ����ͬ���
    dll.addLast("Last");
    System.out.println(dll);

    //��ӵ�ָ��λ��
    dll.add(4, "Middle");
    System.out.println(dll);

    //�Ƴ���ǰ��
    dll.removeFirst();
    System.out.println(dll);

    //�Ƴ�����
    dll.removeLast();
    System.out.println(dll);

    //�Ƴ�ָ��λ���ϵ�
    dll.remove(2);
    System.out.println(dll);

    //����ָ��λ���ϵ�Ԫ��
    System.out.println(dll.get(1));

  }
}