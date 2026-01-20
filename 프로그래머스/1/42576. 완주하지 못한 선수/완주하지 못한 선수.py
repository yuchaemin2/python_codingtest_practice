def solution(participant, completion):
    answer = ''
    
    p = {}
    
    for i in participant:
        if i in p:
            p[i] += 1
        else:
            p[i] = 1
            
    for i in completion:
        p[i] -= 1
        if p[i] == 0:
            del p[i]
        
    answer = list(p)[0]
    # answer = list(p.keys())[0]
    return answer