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
    public int solve(ListNode head){
        ListNode temp = head;
         int count = 0;
        while(temp!=null){
           
            temp = temp.next;
             count++;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
       int length = solve(head);

       if(length < k){
        return head;

       }

       int val = 0;

       ListNode curr = head;
       ListNode prev = null;
       ListNode next = null;

       while(curr!=null && val < k){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        val++;
       }

       if(next!=null){
        head.next = reverseKGroup(next , k);
       }
       return prev;
    }
}