# note

### 这题考点是BFS

### tricky的地方是怎么去判断结点是否在一条竖线上；解决方案（以整棵树的root为中心，设为0，往左-1，往右+1）

### BFS遍历整棵树，记录col的值，放入map里
### 遍历结束后将map的val放入list里，返回即可