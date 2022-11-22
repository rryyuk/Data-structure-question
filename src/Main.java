import q2addtwonumbers.ListNode;
import q2addtwonumbers.Q2AddTwoNumbers;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ListNode nodeThree = new ListNode(1,null);
//        ListNode nodeTwo = new ListNode(3,nodeThree);
//        ListNode nodeOne = new ListNode(5,nodeTwo );
//        // 1 -> 2 -> 3
//
//        ListNode nodeD = new ListNode(1,null);
//        ListNode nodeC = new ListNode(2,nodeD);
//        ListNode nodeB = new ListNode(4,nodeC);

//
//        ListNode sumNode = new Q2AddTwoNumbers().addTwoNumbers(nodeOne, nodeA);
//
//        while(sumNode != null) {
//            System.out.println(sumNode.val);
//            sumNode = sumNode.next;
//        }

//        Q20ValidParentheses calcualte = new Q20ValidParentheses();
//        Q21MergeTwoSortedList calcualte = new Q21MergeTwoSortedList();
//        ListNode sumNode = new Q21MergeTwoSortedList().mergeTwoLists(nodeOne,nodeB);
//        while(sumNode != null) {
//            System.out.println(sumNode.val);
//            sumNode = sumNode.next;
//        }
//        int[] price = {7,1,5,3,6,4};
//        Q121BuySell calculate = new Q121BuySell();
//        System.out.println(calculate.maxProfit(price));

        int[] frequecny = {3,1,-2,-5,2,-4};

//        Q169MajorityElement calcualte = new Q169MajorityElement();
//        System.out.println(calcualte.majorityElement(frequecny));

//        Q189RotateArray calcualte = new Q189RotateArray();
//        int[] num = calcualte.rotate(frequecny, 2);
//        for(int i = 0; i < num.length; i++) {
//            System.out.print(num[i]);
//        }
//        Q2149RearrangeArrayElementBySign calcualte = new Q2149RearrangeArrayElementBySign();
//        int[] num = calcualte.rearrangeArray(frequecny);
//        for(int i = 0; i < num.length; i++) {
//            System.out.print(num[i]);
//        }

//        Q1903LargestOddNumberString calculate = new Q1903LargestOddNumberString();
//        System.out.println(calculate.largestOddNumber("123456"));
        Q242ValidAnagram calculate = new Q242ValidAnagram();
        System.out.println(calculate.isAnagram("acac", "accc"));
    }

}
