package implementation;

import adt.MylinkedList;
import node.Node;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MylinkedList list=new MylinkedList();
        list.traverse();
        list.insertAtlast(1000);
        list.traverse();

        list.insertAtBegining(2000);
        list.traverse();
        Node deletednode=list.deleteAtfirst();
       if(deletednode!=null){
           System.out.println("deleted node"+deletednode.getData());
       }
       else{
           System.out.println("empty list");
       }
       list.traverse();
       deletednode=list.deleteAtfirst();
        if(deletednode!=null){
            System.out.println("deleted node "+deletednode.getData());
        }
        else{
            System.out.println("empty list");
        }
        list.traverse();
        list.insertAtlast(100);
        list.insertAtlast(2);
        list.insertAtlast(23);
        list.insertAtlast(500);
        list.traverse();
        list.sort();
        list.traverse();
    }
}
