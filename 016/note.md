# note

**返回最接近于给定值的值,不是差！**

定义一个变量 res 用来记录最终的值（初始用 res = nums[0]+nums[2]+nums[nums.length-1]）;
；
先将数组排个序，然后开始遍历数组，思路跟那道三数之和很相似，都是先确定一个数，然后用两个指针 left 和 right 来滑动寻找另外两个数; 每确定两个数，求出此三数之和，然后比较target和sum的绝对差 和 target和res的绝对差 res更新为小的那个