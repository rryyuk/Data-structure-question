package q2addtwonumbers;

public class Q141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer) {
                return true;
            }
        }
        return false;
    }
}
