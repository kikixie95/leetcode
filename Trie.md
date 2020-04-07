# Trie

## 一种专门处理字符串匹配的数据结构； Trie树的本质，就是利用字符串之间的公共前缀，将重复的前缀合并在一起

## e.g. `how，hi，her，hello，so，see` 六个字符串，预处理后组织成Trie树的结构
![6string](/image/6string.jpg)
**根节点不包含任何信息**

## 在 Trie 树中，查找某个字符串的时间复杂度是多少？
- 构建 Trie 树的过程，需要扫描所有的字符串，时间复杂度是 O(n)（n 表示所有字符串的长度和）
- 构建好 Trie 树后，在其中查找字符串的时间复杂度是 O(k)，k 表示要查找的字符串的长度

## 