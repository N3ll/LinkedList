In this exercise you will program a generic single-linked list. The elements (contained in nodes of type Node<E>) in the list must be kept sorted in ascending order (so the elements must implement Comparable<? super E>). The specification for the list is shown below.
Make a small test program too.
/**
 * Models a sorted single-linked list of comparable objects.
 */
public class SingleLinkedList<E extends Comparable<? super E>> { /**
      * Creates an empty single-linked list.
*/
public SingleLinkedList() { // TODO
}
     /**
      * Inserts the specified element in the list.
      * The list is still sorted after insertion.
      */
public void insert(E e) { // TODO
}
     /**
      * Removes the first occurrence of the specified element from the list.
      * The list is still sorted after removal.<br />
      * Returns true, if an element was removed from the list.
      */
public boolean delete(E e) {
// TODO
return false; }
13I SADP
     /**
      * Prints the list to System.out.
      */
public void print() { // TODO
}
     /**
      * Returns the size of the list.
      */
public int size() { // TODO
return -1; }
}

Extend the single-linked list from exercise 3 with the method below.
     /**
      * Inserts all elements from the specified list into this list.
      * The list is still sorted after insertion.
      */
public void insertAll(SingleLinkedList<? extends E> list){ ... }
