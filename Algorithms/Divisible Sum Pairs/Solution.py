def divisibleSumPairs(n, k, ar):
    cnt = 0
    for i in range(n):
        for j in range(i+1, n):
            if i < j and (ar[i]+ar[j]) % k == 0:
                cnt += 1
            else:
                continue
    
    return cnt