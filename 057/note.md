# note

这题居然是个hard。。。

思路还是很清晰的，只要找到原数组中某个数组的右边界比插入数组的左边界小，某个数组的左边界比插入数组的右边界小即可

因此可以将数组分为三个部分：

1. 子数组的右边界比插入数组的左边界小；直接将子数组放入答案中
2. overlap了； 遍历数组，比较左边界取最小值，比较右边界取最大值；出循环后，将新的子数组放入答案
3. 剩下的子数组必然不在范围内，遍历放入答案；