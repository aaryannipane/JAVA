// Insert a node in a Singly Linked List at a given position
class SLL{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null; 
        }
    }

    public void insert(int data, int position){
        ListNode newNode = new ListNode(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            newNode.next = previous.next;
            previous.next = newNode;
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

        sll.insert(10, 1);
        sll.insert(20, 2);
        sll.insert(50, 1);

        sll.display();
    }
}