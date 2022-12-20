package com.bridgelabz;

class Node{

    int data;
    Node next;

    public Node(){
        this.data = data;
        this.next = null;
    }
}
public class Stack {

    Node top;
    public Stack(){
        this.top = null;
    }

    public void push(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = top;
        top = temp;
    }

    public void display(){
        if(top ==  null){
            System.out.print("Stack is empty");
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String args[]){
          Stack object = new Stack();
          object.push(70);
          object.push(30);
          object.push(56);
          object.display();
    }
   
}
