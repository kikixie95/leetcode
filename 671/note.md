## 思路

### 根据题意，树中的最小值必然是根节点。 所以只需比较树中的其他结点，找到最小的，和根节点进行比较，若比根节点大，那么此结点的值就是第二小的，否则就没有第二小的；

### 有个坑：节点的值可能会比Integer.MAX_VALUE还大，所以这个地方需要引用 Long.MAX_VALUE;