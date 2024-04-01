def birthday(s, d, m):
    cnt = 0
    
    for i in range(n-m+1):
        if(sum(s[i:i+m]) == d):
            cnt += 1
        
    return cnt