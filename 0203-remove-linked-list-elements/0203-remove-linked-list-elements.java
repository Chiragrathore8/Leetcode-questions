class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0), curr = temp;
        temp.next = head;
        while(curr.next != null){
            if(curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return temp.next;
    }
}