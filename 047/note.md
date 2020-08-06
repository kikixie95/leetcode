# note

解题思路
本题的基本框架依旧和46. 全排列是一样的，但是加了附加条件，需要做一下剪枝，首先说一下46. 全排列 是怎么做的：

这道题我们需要使用回溯的方法来进行求解。那我们回溯法的解体框架是什么呢，解决一个回溯问题，实际上就是一个决策树的遍历过程。一般来说，我们需要解决三个问题：

路径：也就是已经做出的选择。
选择列表：也就是你当前可以做的选择。
结束条件：也就是到达决策树底层，无法再做选择的条件。
我们所使用的框架基本就是：
``` java
    
        public void backtrack(路径，选择列表){
    if(满足结束条件){
        result.add(结果);
    }
    for(选择：选择列表){
        做出选择;
        backtrack(路径，选择列表);
        撤销选择;
    }
}

**其中最关键的点就是：在递归之前做选择，在递归之后撤销选择。**

由于本题需要返回所有不重复的全排列，有限制条件，所以需要进行剪枝。这里第一步先要给数组进行排序。

首先，先要给nums进行排序，这样的做目的是方便剪枝

其次，我们已经选择过的不需要再放进去了

接下来，如果当前节点与他的前一个节点一样，并其他的前一个节点已经被遍历过了，那我们也就不需要了。