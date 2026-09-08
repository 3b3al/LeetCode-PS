/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;      //make current and next point to the same node 
        /*
        result
        ↓
        [0 | null]
        ↑
        current
        */

        int carry = 0;

        while ( l1 != null || l2!= null){
                int firstNumber = 0;
                int secNumber = 0 ;

            if(l1 !=null)
                firstNumber = l1.val;
            if(l2 != null)
                secNumber = l2.val;

            int sum = firstNumber+secNumber+carry;

            int firstDiget = sum%10;
            carry = sum/10;  

            current.next = new ListNode(firstDiget);
            /*
              result
                ↓
                [0] → [7] → null
                        ↑
                    current
             */
            current = current.next;
            
            if(l1 != null)
                l1=l1.next;
            if(l2 != null)
                l2=l2.next;
        }
        if(carry > 0)
            current.next = new ListNode(carry);
        return result.next;
    }
}