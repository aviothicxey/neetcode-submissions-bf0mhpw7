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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        int len = length(head);
        if(n == len) return head.next;
        int remove = len - n -1 ;
        ListNode temp = head;
        for(int i = 0 ; i < remove ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }
    public int length(ListNode head){
        if(head == null)return 0;
        int cnt = 0;
        while(head != null){
            cnt++;
            head = head.next;
        }
        return cnt;
    }
}
