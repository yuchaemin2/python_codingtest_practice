def solution(n):
    answer = []
    
    #case1 
    # answer = str(n) #"12345"
    # answer = list(answer)
    # answer.reverse()
    # answer = list(map(int, answer))
    
    #case2
    while n>0 :
        answer.append(n % 10)
        n = n // 10
        
    return answer