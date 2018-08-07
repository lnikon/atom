package ru.atom.list;

import java.util.List;

/**
 * Contains ref to next node, prev node and value
 */
public class ListNode<E> {
    public E data;
    public ListNode<E> prev;
    public ListNode<E> next;

    ListNode() {
        prev = null;
        next = null;
    }

    ListNode(E e) {
        this();
        data = e;
    }

    ListNode(ListNode<E> prev, E e, ListNode<E> next) {
        this(e);
        this.prev = prev;
        this.next = next;
    }
}
