import q2addtwonumbers.ListNode;

public class Q21MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode head = dummyHead;

        ListNode list1CurrentNode = list1;
        ListNode list2CurrentNode = list2;

        while (list1CurrentNode != null && list2CurrentNode != null) {

            if (list1CurrentNode.val < list2CurrentNode.val) {
                head.next = list1CurrentNode;
                list1CurrentNode = list1CurrentNode.next;
            }
            else {
                head.next = list2CurrentNode;
                list2CurrentNode = list2CurrentNode.next;
            }
            head = head.next;
        }
        if (list1CurrentNode == null) {
            head.next = list2CurrentNode;
        }
        if (list2CurrentNode == null) {
            head.next = list1CurrentNode;
        }
        return dummyHead.next;
    }
}
