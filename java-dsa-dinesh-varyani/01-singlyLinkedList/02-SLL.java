// create a singly linked list in java
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

    public static void main(String[] args){
        // create object of SLL class to access head variable
        SLL sll = new SLL();

        // assign first node to head
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        
        // point node next to next node
        sll.head.next = second;   // 10 --> 20
        second.next = third;      // 10 --> 20 --> 30 --> null

    }

}