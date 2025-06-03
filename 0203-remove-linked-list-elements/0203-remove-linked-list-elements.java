class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode temp = removeElements(head.next, val);
        if(head.val == val){
            return temp;
        }
        else{
            head.next = temp;
            return head;
        }
    }
}