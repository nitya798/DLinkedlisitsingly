package adt;

import node.Node;

public class MylinkedList {
    //start of linked list
    private Node head;
    //insert
    public void insertAtBegining(int data){
        Node node=new Node(data);
        node.setNext(head);
        head=node;

    }
    public void insertAtlast(int data){
        Node node=new Node(data);
        Node t;
        t=head;
        if(t==null){
            head=node;
        }
        else{
            while(t.getNext()!=null){
                t=t.getNext();
            }
            t.setNext(node);
        }
    }
    public void traverse() {
        System.out.println("printing nodes");
        Node t = head;
        while (t != null) {
            System.out.print(t.getData());
            t = t.getNext();

            if (t != null) {
                System.out.print("--->");
            }
        }
        System.out.println();
    }
    public Node deleteAtfirst(){
        Node response=null;
        if(head!=null){
            response=head;
            head=head.getNext();
        }

        return response;
    }
    public Node deleteAtLast(){
        Node response=null;
        if(head!=null){
            Node t=head;
            Node previous=null;
            while(t.getNext()!=null){
                previous=t;
                t=t.getNext();
            }
            response=t;
            if(previous!=null){

                previous.setNext(null);
            }
            else{

                head=null;
            }
        }
        return response;
    }
    public boolean search(int data){
        boolean response=false;

            Node t=head;
            while( t!=null){
                if(t.getData()==data){
                    response=true;
                    break;
                }
                t=t.getNext();
            }

        return response;
    }
    public void sort(){
        if(head!=null){
        Node t=head;

        while(t.getNext()!=null){
            Node nextNode=t;
            while(nextNode.getNext()!=null){
                if(nextNode.getData() > nextNode.getNext().getData()){
                    int data=nextNode.getData();
                    nextNode.setData(nextNode.getNext().getData());
                    nextNode.getNext().setData(data);
                }
                //to identify error
                System.out.print(nextNode.getData()+ ", ");
                nextNode=nextNode.getNext();

            }
            t=t.getNext();
            System.out.println();


        }
    }}

    //delete
    //traverse
    //search
    //sort
    //merge



}
