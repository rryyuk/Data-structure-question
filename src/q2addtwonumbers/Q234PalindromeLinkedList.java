package q2addtwonumbers;
import java.io.*;
import java.util.*;

public class Q234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        stack.push(slowPointer.val);

        while (fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            stack.push(slowPointer.val);
        }
        slowPointer = slowPointer.next;

        if (fastPointer.next == null) {
            stack.pop();
        }

        while (slowPointer != null) {
            final int stackValue = stack.pop();
            if (stackValue != slowPointer.val) {
                return false;
            }
            slowPointer = slowPointer.next;
        }

        return true;
    }
}

//
//if (head == null || head.next == null) {
//        return true;
//        }
//
//        Stack s = new Stack();
//        ListNode slow = head;
//        ListNode fast = head;
//        int counter = 0;
//
//        s.push(slow.val);
//
//
//        while(fast.next != null && fast.next.next != null) {
//        slow = slow.next;
//        s.push(slow.val);
//        fast = fast.next.next;
//        counter++;
//        System.out.println(fast.val);
//        }
//
//        slow = slow.next;
//        counter++;
//        System.out.println(counter);
//
//        while(slow != null) {
//            System.out.println(s.peek());
//        if(counter == 0) {
//        int currentNode = (Integer) s.pop();
//        if (currentNode == slow.val) {
//        return true;
//        } else {
//        return false;
//        }
//        } else if (counter % 2 == 0) {
//        s.pop();
//        counter = 1;
//        }
//        int currentNode = (Integer)s.pop();
//        if(currentNode == slow.val){
//        slow = slow.next;
//        } else {
//        return false;
//        }
//
//        }
//        return true;