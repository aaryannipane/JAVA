// delete last node in java
class SLL{
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // method to insert node at end 
    public void insertEnd(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
        }
        else{
            ListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // method to delete node at first position
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // method to delete last node 
    public ListNode deleteLast(){
        if(head == null){
            return null;
        }

        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current;


    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){

        SLL sll = new SLL();

        sll.insertEnd(20);
        sll.insertEnd(30);
        sll.insertEnd(100);

        // sll.deleteFirst();

        sll.display();

        sll.deleteLast();


        sll.display();

    }
}