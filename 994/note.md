# note

**用BFS的思想遍历整幅图**

将所有等于2 的坐标装进队里， 用一个变量one储存所有值等于1 的个数；

遍历完整幅图后，开始处理队里的元素;变量count记录操作的次数
poll出来的元素，检查一遍他的四个方向的数值，若是0或2，continue，否则将这个值变为2；one--；

当队列为空时，检查count的值，若为0，返回count-1，若不是，返回-1；

