public class StackList<E> {

    private class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
        }
    }

    Node head;

    public void push(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
    }

    public int pop(){
        Node temp;
        if(head==null)
        {
            System.out.print("its empty");
            throw new NullPointerException("its empty") ;
        }else{
            temp = head;
        head=head.next;
        temp.next=null;
        return temp.data;
        }
    }





}
