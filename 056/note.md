## 将二维数组按arr[i][0]的大小排序；之后遍历整个二维数组；若arr[i][0]的值小于之前merge后的arr[i][0]的值，则取二者中的较小值； arr[i][1]的值取二者中的较大者；除此之外的情况就是两个数组没有overlap，这时把这个新的数组加到在merge数组最后；重复这个过程；用一个指针一直记录merge的最新的数组的index；

## 最后返回copyof(arr,index+1)即可