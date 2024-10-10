package linked_list;

public class LinkedStack<T>{
















    public boolean isEmpty(){
        return head == null;
    }








    
    public T pop() throws EmptyStackException{
        if(isEmpty()) throw new EmptyStackException("Empty stack");
        
        T val = (T) head.e;
        Node temp = head;
        head = head.next;
        size--;
        //delete(temp); garbage colloctor
        return val;
    }
    public T peek(){
        return isEmpty() ? null: (T) head.e;
    }
}