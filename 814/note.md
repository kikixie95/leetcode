## 思路

### recursion

**当结点及其左右子孩子都不是1时，将以这个结点为根节点的子树去掉**
- 递归出口： 遍历到结点为null时，返回false
- 大问题可以被分成小问题解决 (root是不是为1，root的左子结点是不是为1，root的右子结点是不是为1，求这三者的布尔或值；为true就返回root,为false,返回null)
- 逻辑一致（判断3个结点的值是不是1，若是，返回true，若不是返回false)
