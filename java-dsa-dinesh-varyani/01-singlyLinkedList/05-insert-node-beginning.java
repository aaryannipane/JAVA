// Insert node at the beginning of a Singly Linked List in Java
class SLL{
    
    // head pointer to first node of list
    private ListNode head;

    // static inner class cause we can make instance of this static class without creating instance of outer class
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // display method to display linked list 
    public void display(){
        // current pointer to listNode 
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // length method to give length of SLL
    public int length(){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }

    // method to insert node at beginning 
    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        // this.display();
    }

    public static void main(String[] args){
        // create object of SLL class to access head variable
        SLL sll = new SLL();
        


        // insert node at beginning
        sll.insertFirst(40);
        sll.insertFirst(1);
        sll.insertFirst(20);


        // display elements of SLL
        sll.display();
    }

}