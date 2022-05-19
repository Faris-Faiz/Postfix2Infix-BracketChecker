import java.util.ArrayList;

public class Stack <E> {
    private ArrayList<E> list = new ArrayList<>();

    /**
     * Adds an element at the top of the stack
     * @param o the element desired to be added
     */
    public void push(E o) {
        list.add(o);
    }

    /**
     * Removes the last element (top of the stack) of the stack
     * @return the removed element that is the last element of LinkedList, but it's at the top of the stack
     */
    public E pop(){
        E o = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

    /**
     * Uses get() method from LinkedList to retrieve the last element, alongside subtracting 1
     * from the size of the LinkedList to get the last index of the element
     * @return Returns the element at the top of the stack
     */
    public E peek(){
        return list.get(list.size() - 1);
    }

    /**
     * Retrieves the size of the stack using size() method from LinkedList
     * @return the size of the stack
     */
    public int getSize(){
        return list.size();
    }

    /**
     * Uses toString() method from LinkedList
     * @return Returns string representation of the stack
     */
    public String toString(){
        return list.toString();
    }

    /**
     * Uses contains() method in LinkedList to determine if the element exists
     * @param e the desired element
     * @return True if exists, False if doesn't exist.
     */
    public boolean contains(E e){
        return list.contains(e);
    }

    /**
     * Uses the size() method from LinkedList to determine if the queue is empty.
     * @return True/False if the size of the element is 0. True if it is 0, false if it isn't equal to 0.
     */
    public boolean isEmpty(){
        return list.size() == 0;
    }
}
