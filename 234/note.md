# note

用快慢指针遍历链表，快指针比慢指针快两步，那么当快指针遍历完毕时，慢指针刚好走了链表的一半；（这里有坑，若链表长度为奇数，慢指针刚好在中间，需要出循环后判断下快指针是否为null，若不是，慢指针要往前再走一步）

翻转后半部分链表，然后前半部分和后半部分同时遍历，若有不同的值，直接返回false，若遍历完，返回true；