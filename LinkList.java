import java.awt.SystemColor;
import java.util.*;

public class LinkList{
    public Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node deletionByIndex(LinkList list,int index){
        Node currnnode=list.head;
        if(index==1){
            list.head=list.head.next;
            System.out.println("You have deleted the head node of this list");
            return list.head;
        }
        else{
            int counter=1;
            Node prev;
            while(currnnode.next!=null && counter<=index){
                ++counter;
                prev=currnnode;
                currnnode=currnnode.next;
                if(counter==index){
                    prev.next=currnnode.next;
                    System.out.println("node at index "+counter+" with value "+currnnode.data+" is deleted");
                    return list.head;
                }
                
            }
            System.out.println("There is no such index present in this list");
            return null;
        }
    }
    public static Node insertAtIndex(LinkList list,int index,int data){
        Node new_node=new Node(data);
        if(list.head==null){
            System.out.println("your list is empty please give appropriate list");
        }
        if(index==1){
            new_node.next=list.head;
            list.head=new_node;
            return list.head;
        }
        else{
            int counter=1;
            Node temp=list.head;
            while(temp.next!=null && counter<=index){
                ++counter;
                if(counter==index){
                    Node temp1=temp.next;
                    temp.next=new_node;
                    new_node.next=temp1;
                    return list.head;
                }
                temp=temp.next;
            }
            System.out.println("No such index is present in this list");
            return null;
        }
        
    }
    public static Node insertNode(LinkList list,int data){
        Node new_node=new Node(data);
        if(list.head==null){
            list.head=new_node;
            return list.head;
        }
        else{
            Node temp=list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
            return list.head;
        }
    }
    public static void printList(LinkList list){
        Node currnnode=list.head;
        while(currnnode!=null){
            System.out.println(currnnode.data);
            currnnode=currnnode.next;
        }
    }
    public static void main(String args[]){
    LinkList list=new LinkList();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of node you want to insert");
    int number=sc.nextInt();

    for(int i=1;i<=number;i++){
    System.out.println("Enter the value of "+i+" node");
    insertNode(list, sc.nextInt()); 
    }
    printList(list);
    
    System.out.println("To alter link list enter the value of index on which you want to insert node");
    int index=sc.nextInt();
    System.out.println("Enter the data you want to insert");
    int data=sc.nextInt();
    insertAtIndex(list,index, data);
    printList(list);
    System.out.println("enter the index at which position you want to delete your node");
    index=sc.nextInt();
    deletionByIndex(list, index);
    printList(list);
    }
}