//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 326 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class congWeiDaoTouDaYinLianBiaoLcof{
    //2022-08-25 20:56:43
    //从尾到头打印链表
    //编号：[剑指 Offer 06]
    private static ListNode createLinkedList(int[] arr) {//将输入的数组输入到链表中
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {//过程
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static void printLinkedList(ListNode head){//将链表结果打印
        ListNode current =  head;
        while (current!=null){
            System.out.printf("%d -> ",current.val);
            current = current.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        int[] x = {1,3,2};
        Solution solution = new congWeiDaoTouDaYinLianBiaoLcof().new Solution();
        ListNode linkedList = createLinkedList(x);
        int[] ints = solution.reversePrint(linkedList);
        ListNode linkedList1 = createLinkedList(ints);
        printLinkedList(linkedList1);

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
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        System.out.println(list);
        Collections.reverse(list);
        int[] ss = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++){
            ss[i] = list.get(i);
        }
        return ss;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}