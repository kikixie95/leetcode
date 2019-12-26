## 思路

### 题意： 找出通过wordList里的词从beginWord转化成endWord的最短路径

### 用BFS的思路，层次遍历寻找最短路径

### 非常有灵性的操作：

- 创建一个queue，将字符串一层层放进去。 父结点移出去，就要将其子结点们装进来。queue的size就是上一层结点的个数。
- 创建一个char[]， 装26个字母 （26是O(1)的时间复杂度）
- 创建一个hashset，将wordList装进去。
- **最有灵性的操作**， 每次只变换这个单词（父结点）的一个字母，再到set里寻找有没有变换后的单词，有的话，就作为子结点放进queue里，直至找不到了（此时说明这个父结点的子结点全部找到）；size-1.；再次重复上述操作，直至size为0（说明一层已经遍历完）；step的值+1， 
- 当变化的单词和endWord相同时，直接return step+1;这时是最短路径
- 若queue为空时，返回0；