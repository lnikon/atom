package ru.atom.list;

import java.util.*;


public class CustomLinkedList<E> implements List<E> {
    /*
    Number of nodes in list
     */
    private int size;

    /*
    List head
     */
    ListNode<E> head;

    /*
    List tail
     */
    ListNode<E> tail;

    CustomLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    /*
    @return number of nodes
     */
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        E obj = (E )o;
        Iterator<E> itr = this.iterator();
        while(itr.hasNext()) {
            if(itr.next() == obj) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new CustomLinkedListItr<E>();
    }

    @Override
    public boolean add(E e) {
        final ListNode<E> tailCopy = this.tail;
        ListNode<E> newNode = new ListNode<E>(tailCopy, e, null);
        this.tail = newNode;
        if(tailCopy == null) {
            this.head = tail;
        } else {
            tailCopy.next = this.tail;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    /*
    Implementation of this iterator is similar to the ArrayList Itr nested class
    */
    public class CustomLinkedListItr<E> implements Iterator<E> {
        int cursor;

        CustomLinkedListItr() { }

        @Override
        public E next() {
            if(this.cursor >= CustomLinkedList.this.size) {
                throw new NoSuchElementException();
            } else {
                ListNode copyNode = CustomLinkedList.this.head;

                int j = 0;
                while(j != this.cursor) {
                    copyNode = copyNode.next;
                    ++j;
                }

                this.cursor++;

                return (E) copyNode.data;
            }
        }

        @Override
        public boolean hasNext() {
            return this.cursor != CustomLinkedList.this.size;
        }
    }

    /*
      !!! Implement methods below Only if you know what you are doing !!!
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return true;
            }
        }
        return true;
    }

    /**
     * Do not implement
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    /**
     * Do not implement
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    /**
     * Do not implement
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    /**
     * Do not implement
     */
    @Override
    public void add(int index, E element) {
    }

    /**
     * Do not implement
     */
    @Override
    public E remove(int index) {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    /**
     * Do not implement
     */
    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     * Do not implement
     */
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Do not implement
     */
    @Override
    public E set(int index, E element) {
        return null;
    }
}
