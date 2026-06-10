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

    public static int size(ListNode head){
        ListNode temp = head;

        int count =0 ;
        while(temp != null){
            count++;

            temp = temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int sizee = size(head);

        if(sizee == n){
            return head.next;
        }

        int first = sizee- n;  

        ListNode ptr = head;
        for(int i = 1; i < first; i++){
            ptr = ptr.next;
        }

        ptr.next = ptr.next.next;

        return head;


    }
}