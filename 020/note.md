# note

**hashmap & stack**

从左往右遍历字符串，遇到左括号就将其入栈，遇到右括号时，将栈顶元素取出，通过hashmap找到其value， 再将其与右括号比较，若一致则继续，若不一致则直接返回；**有两种极端情况：**
- 还未遍历完字符串，栈就空了。此时返回false
- 遍历完了字符串，栈还没空，此时也返回false