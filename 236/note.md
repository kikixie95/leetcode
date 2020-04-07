# note

### recursive
    如果root为空，则返回空
    如果root等于其中某个node，则返回root

    若以上两种情况都不满足，则递归左右子树，有三种情况：
    - 左子树和右子树的返回值都不是null，说明当前结点就是最小公结点
    - 左子树有返回值，右子树没有，说明左子树的返回值是最小公结点
    - 右子树有返回值，左子树没有，说明右子树的返回值是最小公结点


### iterative
    写一个helper function用来搜索传参进来的结点的所有子结点，用一个全局变量count记录子结点中等于q、p的个数；返回count；
    用postorder遍历整棵树，每个根结点都调用helper，当count==2时，结束遍历，返回此时的父结点