package src.CodingNinja;

public class AddTwoNumbers {
    static class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
        }
    }
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2){
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode current = dummy;

        int carry = 0;

        while ( head1 != null || head2 != null || carry != 0 ){

            int value1 = ( head1 != null) ? head1.data : 0;
            int value2 = ( head2 != null) ? head2.data : 0;

            int sum = value1 + value2 + carry;
            carry = sum / 10;

            current.next = new LinkedListNode(sum % 10);
            current = current.next;

            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }
        return dummy.next;
    }
    static LinkedListNode createLinkedList(int[] arr) {
        LinkedListNode head = new LinkedListNode(arr[0]);
        LinkedListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new LinkedListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper function to print a linked list
    static void printLinkedList(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> NULL");
    }

    // Main function to test the addTwoNumbers method
    public static void main(String[] args) {
        // Creating two linked lists for the example:
        // num1 = 1 -> 2 -> 3 -> NULL (represents 321)
        // num2 = 4 -> 5 -> 6 -> NULL (represents 654)

        int[] num1 = {5, 6, 3};
        int[] num2 = {8, 4, 2};

        LinkedListNode head1 = createLinkedList(num1);
        LinkedListNode head2 = createLinkedList(num2);

        // Printing the input linked lists
        System.out.println("Input linked lists:");
        System.out.print("num1: ");
        printLinkedList(head1);
        System.out.print("num2: ");
        printLinkedList(head2);

        // Adding the two numbers represented by the linked lists
        LinkedListNode result = addTwoNumbers(head1, head2);

        // Printing the result
        System.out.print("Result: ");
        printLinkedList(result);
    }

}
