# note

    用String来保存每棵树的结构和值，用hashmap建立树和出现的次数之间的映射；若出现的次数 == 2，则说明之前已经有相同的树了。将这个结点放入list里；