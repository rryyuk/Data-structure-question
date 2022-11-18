package q2addtwonumbers;

public class Q2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentListNode1 = l1;
        ListNode currentListNode2 = l2;

        ListNode sumList = new ListNode(); // sumList empty -> null
        ListNode tempNode = sumList;
        int carry = 0;
        while(currentListNode1 != null || currentListNode2 != null) {
            int sum = 0;
            if(currentListNode1 != null) {
                 sum = sum + currentListNode1.val;   // l1 = 9, l2 = 9, sum = 9
                currentListNode1 = currentListNode1.next;
            }

            if(currentListNode2 != null) {
                sum = sum + currentListNode2.val;  // sum = 18
                currentListNode2 = currentListNode2.next;
            }

            sum += carry;           // sum = 18, carry = 0
            carry = sum/10;         // sum = 18, carry = 1
            sum = sum%10;           // sum = 8, carry = 1


            sumList.next = new ListNode(sum); //sumList = empty -> 8 -> null
            sumList = sumList.next;             // 8
        }

        if(carry > 0) {
            sumList.next = new ListNode(carry);
        }
        return tempNode.next;
    }
}
