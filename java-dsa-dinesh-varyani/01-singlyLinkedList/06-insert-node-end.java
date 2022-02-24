// Insert node at the end of a Singly Linked List in Java
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

        sll.display();

    }
}