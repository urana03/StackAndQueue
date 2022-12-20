package com.bridgelabz;


class Node{
   
    int data;
    Node next;
    
    Node(int data){
        
        this.data = data;
        this.next =  null;
    }
    
 }
 public class Queue{
     static Node head;
 public void enqueue(int data) {
    
    Node newNode = new Node(data);
    
    if(head == null) {
        head = new Node(data);
        return;
    }
    newNode.next = null;
    
    Node last = head;
    while(last.next != null)
        last = last.next;
    last.next = newNode;
    return;
 }
 public void dequeue(){
    if(head == null){
        System.out.print("Empty Queue");
    }
    else{
        head = head.next;
    }
 }

 public void printList() {
    
    Node n = head;
    while(n != null) {
        System.out.print(n.data+" ");
        n=n.next;
    }
 }
 
 public static void main(String args[]) {
 
    Queue obj = new Queue();
    
    obj.enqueue(56);
    obj.enqueue(30);
    obj.enqueue(70);
    obj.printList();
    System.out.println();
    obj.dequeue();
    obj.printList();
 }
 }