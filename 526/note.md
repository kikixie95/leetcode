# note

我们常数从 1 到 N 创建所有的排列。我们可以将一个数字放在一个特定位置并检查这个数字在这个位置的可除性。但我们还需要记录之前已经使用过哪些数字以免重复使用同一个数字。如果当前数字不能满足可除性要求，当前位置为这个数的所有排列我们就都不需要考虑了，这个剪枝可以让我们的搜索空间大大减少。我们通过将每个数字在每个位置进行检查来实现这一过程。

我们使用一个使用一个大小为 NN 的 “已使用数组” ，这里 visited[i]visited[i] 表示目前为止第 ii 个数字是否已经使用过，True 表示已经使用过， False 表示还没有使用过。
