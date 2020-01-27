## 思路

### 
- 递归出口：当某结点是null时， 返回0；
- 递归过程：
    -  1. 当前结点和左右子结点是否值一致，若一致，累积的长度加1；
    -  2. 当前结点的最长长度就是，左边子结点的最长值与右边左边子结点的最长值的较大值；
    -  3. 再更新全局最长路径：当前结点的最长长度 与 当前全局最长长度的较大值；
- 递归返回值：当前结点的 左边子结点的最长值 与 右边左边子结点的最长值的较大值（即返回当前结点的最长长度）