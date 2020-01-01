## 思路

### 两个思路

### 用HashSet (时间复杂度O(n) 空间复杂度O(n))
遍历整个链表，若head始终不为空，且有与Hashset里元素重复的元素，返回true，反之返回false。

### 用快慢指针(时间复杂度O(n) 空间复杂度O(1))
快慢指针从同一起点出发，快指针每次走两个结点，慢指针每次走一个结点，若链表有环，快慢指针必然会在某个结点相遇。