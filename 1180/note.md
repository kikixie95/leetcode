# note

用一个变量prev存最近一个相同字符的值， 用一个变量c存放当前指针指向的char；
遍历整个字符串， 若prev == c，计数器++；若不等，计数器返回1开始重新计数；
res加上每一轮count的值；并将prev赋值为c；