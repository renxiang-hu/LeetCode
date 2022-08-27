//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。 
//
// 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。 
//
// 
//
// 示例： 
//
// 
//给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
//
// Related Topics 链表 双指针 👍 391 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class lianBiaoZhongDaoShuDiKgeJieDianLcof{
    //2022-08-26 07:36:52
    //链表中倒数第k个节点
    //编号：[剑指 Offer 22]
    
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        Solution solution = new lianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(x);
        ListNode kthFromEnd = solution.getKthFromEnd(linkedList, 2);
        PrintLink.printLinkedList(kthFromEnd);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head;
        List<Integer> list = new ArrayList<>();
        while (cur != null){
           list.add(cur.val);
           cur = cur.next;
        }
        ListNode cur1 = head;
        ListNode dummyNode = null;
        for (int i = 0 ; i < list.size() - k ; i++){
            ListNode next = cur1.next;
            dummyNode = cur1;
            cur1 = next;
        }
       return cur1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}