//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,2,1]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围[1, 10⁵] 内 
// 0 <= Node.val <= 9 
// 
//
// 
//
// 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
//
// Related Topics 栈 递归 链表 双指针 👍 1486 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class palindromeLinkedList{
    //2022-08-25 23:27:47
    //回文链表
    //编号：[234]
    
    public static void main(String[] args) {
        int[] x = {1,2,2,1};
        Solution solution = new palindromeLinkedList().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(x);
        boolean palindrome = solution.isPalindrome(linkedList);
        System.out.println(palindrome);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
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
    public boolean isPalindrome(ListNode head) {
       List<Integer> list = new ArrayList<>();
       ListNode cur = head;
       while (cur != null){
         list.add(cur.val);
         cur = cur.next;
       }
        int i = 0;
       int j = list.size()-1;
       while (i<=j){
           if (list.get(i) == list.get(j)){
               i++;
               j--;
           } else {
               return false;
           }
       }
       return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}