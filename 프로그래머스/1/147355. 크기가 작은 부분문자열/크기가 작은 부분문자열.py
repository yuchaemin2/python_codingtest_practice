def solution(t, p):
    answer = 0
    
    # my code
    # for i in range(len(t)):
    #     if int(t[i:len(p)+i])<=int(p):
    #         if len(t[i:len(p)+i])==len(p):
    #             answer += 1
    
    # basic code
    for i in range(len(t)-len(p)+1):
        if int(t[i:i+len(p)]) <= int(p):
            answer += 1
            
    return answer