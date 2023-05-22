/*Write a Java program to implement a stack using linked list and perform push, pop, and peek operations.*/
class Node{
    int data;
    Node next;
  public Node(int data){
        this.data=data;
        this.next=null;
    }                                                      
}
class Stack{
    private Node top;
public Stack(){
        this.top=null;
    }
   public void push(int data){
        Node newNode=new Node(data);
        if (isEmpty()) {
            top=newNode;
        } 
        else{
            newNode.next=top;
            top=newNode;
        }
        System.out.println("Pushed element:"+data);
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty.Cannot pop element");
            return -1;
        }
        int poppedElement=top.data;
        top=top.next;
        return poppedElement;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty. Cannot peek element");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top==null;
    }
}

public class StackUsingLinkedlist_and_performOperations{
    public static void main(String[] args){
        Stack stack=new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Peeked element:"+stack.peek());
        System.out.println("Popped element:"+stack.pop());
        System.out.println("Popped element:"+stack.pop());
        System.out.println("Peeked element:"+stack.peek());
          stack.push(50);
        System.out.println("Peeked element:"+stack.peek());
    }
}
